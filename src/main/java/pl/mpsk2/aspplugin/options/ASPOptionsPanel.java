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

import com.intellij.openapi.options.BaseConfigurable;
import com.intellij.openapi.options.Configurable;
import com.intellij.ui.IdeBorderFactory;
import com.intellij.ui.border.IdeaTitledBorder;
import org.jetbrains.annotations.NotNull;
import pl.mpsk2.aspplugin.ASPLanguage;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.util.Observable;
import java.util.Observer;

public class ASPOptionsPanel extends BaseConfigurable implements Configurable {
    private JPanel mainPanel;
    private JPanel claspPanel;
    // private JPanel clingoPanel;
    // private JPanel gringoPanel;
    private ASPInterpretersTable claspTable;
    // private ASPInterpretersTable clingoTable;
    // private ASPInterpretersTable gringoTable;

    public ASPOptionsPanel() {
        claspTable = new ASPInterpretersTable();
        // clingoTable = new ASPInterpretersTable();
        // gringoTable = new ASPInterpretersTable();

        claspTable.addObserver(new Observer() {
            @Override
            public void update(Observable observable, Object o) {
                setModified(true);
            }
        });

        claspPanel.add(claspTable.getComponent());
        // clingoPanel.add(clingoTable.getComponent());
        // gringoPanel.add(gringoTable.getComponent());

        TitledBorder claspBorder = IdeBorderFactory.createTitledBorder("Clasp", false);

        claspPanel.setBorder(claspBorder);
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return ASPLanguage.INSTANCE.getDisplayName();
    }

    @Override
    public void apply() {
        getData(ASPApplicationSettings.getInstance());
        setModified(false);
    }

    @Override
    public JComponent createComponent() {
        setData(ASPApplicationSettings.getInstance());
        return getMainPanel();
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void setData(ASPApplicationSettings settings) {
        claspTable.setValues(settings.getClaspInterpreters());
    }

    private void getData(ASPApplicationSettings settings) {
        settings.setClaspInterpreters(claspTable.getTableView().getItems());
    }

    public boolean isModified(ASPApplicationSettings settings) {
        return claspTable.hasChanged();
    }
}
