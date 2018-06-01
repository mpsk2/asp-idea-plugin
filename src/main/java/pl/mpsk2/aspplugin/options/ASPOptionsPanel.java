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

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.options.BaseConfigurable;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.ui.DocumentAdapter;
import com.intellij.ui.IdeBorderFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl.mpsk2.aspplugin.ASPLanguage;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import java.awt.*;

public class ASPOptionsPanel extends BaseConfigurable implements Configurable {
    private JPanel mainPanel;
    private GridBagConstraints gridConstraints;
    private TextFieldWithBrowseButton claspPathField;
    private TextFieldWithBrowseButton clingoPathField;
    private TextFieldWithBrowseButton gringoPathField;

    private class MyGridBagConstrains extends GridBagConstraints {
        public void setConstraints(int gridx, int gridy, double weightx, int anchor, int fill) {
            this.weighty = 0;
            this.weightx = weightx;
            this.gridx = gridx;
            this.gridy = gridy;
            this.anchor = anchor;
            this.fill = fill;
        }
    }

    public ASPOptionsPanel() {
        mainPanel.setLayout(new GridBagLayout());
        gridConstraints = new MyGridBagConstrains();

        claspPathField = new TextFieldWithBrowseButton();
        clingoPathField = new TextFieldWithBrowseButton();
        gringoPathField = new TextFieldWithBrowseButton();

        claspPathField.addBrowseFolderListener("Select $Clasp", null, null, FileChooserDescriptorFactory.createSingleLocalFileDescriptor());
        clingoPathField.addBrowseFolderListener("Select $Clingo", null, null, FileChooserDescriptorFactory.createSingleLocalFileDescriptor());
        gringoPathField.addBrowseFolderListener("Select $Gringo", null, null, FileChooserDescriptorFactory.createSingleLocalFileDescriptor());

        DocumentAdapter listener = new DocumentAdapter() {
            @Override
            protected void textChanged(DocumentEvent e) {
                setModified(true);
            }
        };

        claspPathField.getTextField().getDocument().addDocumentListener(listener);
        clingoPathField.getTextField().getDocument().addDocumentListener(listener);
        gringoPathField.getTextField().getDocument().addDocumentListener(listener);

        addLabeledControl(1, "clasp", claspPathField);
        addLabeledControl(2, "clingo", clingoPathField);
        addLabeledControl(3, "gringo", gringoPathField);


        TitledBorder mainBorder = IdeBorderFactory.createTitledBorder("Answer Set Programming interpreters", false);

        mainPanel.setBorder(mainBorder);
    }

    private void addLabeledControl(int row, String label, JComponent component) {
        ((MyGridBagConstrains) gridConstraints).setConstraints(0, row, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE);
        mainPanel.add(new JLabel(label), gridConstraints);
        ((MyGridBagConstrains) gridConstraints).setConstraints(1, row, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
        mainPanel.add(component, gridConstraints);
        ((MyGridBagConstrains) gridConstraints).setConstraints(2, row, 0.1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
        mainPanel.add(Box.createHorizontalStrut(1), gridConstraints);
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return ASPLanguage.INSTANCE.getDisplayName();
    }

    @Override
    public void apply() {
        ASPApplicationSettings state = ASPApplicationSettings.getInstance();
        state.setClasp(claspPathField.getText());
        state.setClingo(clingoPathField.getText());
        state.setGringo(gringoPathField.getText());
        setModified(false);
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        ASPApplicationSettings state = ASPApplicationSettings.getInstance();
        claspPathField.setText(state.getClasp());
        clingoPathField.setText(state.getClingo());
        gringoPathField.setText(state.getGringo());
        return mainPanel;
    }
}
