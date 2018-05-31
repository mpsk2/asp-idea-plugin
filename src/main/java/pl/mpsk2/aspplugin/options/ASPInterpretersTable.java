/*
 * Copyright 2018-2018 Michał Piotr Stankiewicz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.mpsk2.aspplugin.options;

import com.intellij.execution.util.ListTableWithButtons;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.util.ui.ColumnInfo;
import com.intellij.util.ui.ListTableModel;
import com.intellij.util.ui.LocalPathCellEditor;
import org.jetbrains.annotations.Nullable;

import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class ASPInterpretersTable extends ListTableWithButtons<ASPInterpreter> {
    protected ASPInterpretersTable() {
        super();
    }

    @Override
    protected ListTableModel createListModel() {
        ColumnInfo isDefault = new DefaultColumnInfo();
        ColumnInfo name = new NameColumnInfo();
        ColumnInfo path = new PathColumnInfo();

        return new ListTableModel((new ColumnInfo[]{
                isDefault, name, path
        })) {
            @Override
            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
                super.setValueAt(aValue, rowIndex, columnIndex);

                if (columnIndex == 0) {
                    if (Boolean.TRUE.equals(aValue)) {
                        int i = 0;
                        for (ASPInterpreter interpreter : getTableView().getItems()) {
                            if (i != rowIndex && interpreter.isDefault()) {
                                interpreter.setDefault(false);
                                this.fireTableCellUpdated(i, 0);
                            }
                            i++;
                        }
                    }
                }
                else if (columnIndex == 2) {
                    // Manually redraw the derived values
                    this.fireTableCellUpdated(rowIndex, 3);
                    this.fireTableCellUpdated(rowIndex, 4);
                }

                setModified();
            }
        };
    }

    @Override
    protected ASPInterpreter createElement() {
        return new ASPInterpreter();
    }

    @Override
    protected boolean isEmpty(ASPInterpreter e) {
        return e == null;
    }

    @Override
    protected ASPInterpreter cloneElement(ASPInterpreter e) {
        return new ASPInterpreter(e);
    }

    @Override
    protected boolean canDeleteElement(ASPInterpreter e) {
        return true;
    }

    protected abstract class BooleanColumnInfo extends ColumnInfo<ASPInterpreter, Boolean> {
        public BooleanColumnInfo(String name) {
            super(name);
        }

        public Class<?> getColumnClass() {
            return Boolean.class;
        }

        @Override
        @Nullable
        public TableCellRenderer getRenderer(ASPInterpreter element) {
            return null;
        }
    }

    protected class DefaultColumnInfo extends BooleanColumnInfo {
        public DefaultColumnInfo() {
            super("Default");
        }

        @Override
        public Boolean valueOf(ASPInterpreter interpreter) {
            return interpreter.isDefault();
        }

        @Override
        public boolean isCellEditable(ASPInterpreter interpreter) {
            return canDeleteElement(interpreter);
        }

        @Override
        public void setValue(ASPInterpreter interpreter, Boolean b) {
            if (b.equals(valueOf(interpreter))) {
                return;
            }
            interpreter.setDefault(b);
            setModified();
        }
    }

    protected abstract class ColumnInfoBase extends ElementsColumnInfoBase<ASPInterpreter> {
        protected ColumnInfoBase(String str) {
            super(str);
        }

        @Override
        public boolean isCellEditable(ASPInterpreter interpreter) {
            return canDeleteElement(interpreter);
        }

    }

    protected class NameColumnInfo extends ColumnInfoBase {
        public NameColumnInfo() {
            super("Name");
        }

        @Override
        public String valueOf(ASPInterpreter interpreter) {
            return interpreter.getName();
        }

        @Override
        public void setValue(ASPInterpreter interpreter, String s) {
            if (s.equals(valueOf(interpreter))) {
                return;
            }
            interpreter.setName(s);
            setModified();
        }

        @Override
        protected String getDescription(ASPInterpreter interpreter) {
            return valueOf(interpreter);
        }
    }

    protected class PathColumnInfo extends ColumnInfoBase {
        public PathColumnInfo() {
            super("Path");
        }
        @Override
        public String valueOf(ASPInterpreter interpreter) {
            return interpreter.getPath();
        }

        @Override
        public boolean isCellEditable(ASPInterpreter interpreter) {
            return canDeleteElement(interpreter);
        }

        @Override
        public void setValue(ASPInterpreter interpreter, String s) {
            if (s.equals(valueOf(interpreter))) {
                return;
            }
            interpreter.setPath(s);

            // ASPInterpreterFinder.INSTANCE.describe(interpreter);

            setModified();
        }

        @Override
        protected String getDescription(ASPInterpreter interpreter) {
            return valueOf(interpreter);
        }

        @Nullable
        @Override
        public TableCellEditor getEditor(ASPInterpreter ASPInterpreter) {
            FileChooserDescriptor chooserDescriptor = new FileChooserDescriptor(
                    true, false, false, false, false, false
            );
            LocalPathCellEditor cellEditor = new LocalPathCellEditor(null);
            cellEditor.fileChooserDescriptor(chooserDescriptor);
            return cellEditor;
        }
    }
}
