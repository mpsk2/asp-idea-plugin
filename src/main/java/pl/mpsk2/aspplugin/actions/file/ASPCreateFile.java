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

package pl.mpsk2.aspplugin.actions.file;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import pl.mpsk2.aspplugin.ASPFileType;
import pl.mpsk2.aspplugin.ASPIcons;
import pl.mpsk2.aspplugin.ASPLanguage;
import pl.mpsk2.aspplugin.psi.ASPFile;

import java.util.Map;

public class ASPCreateFile extends CreateFileFromTemplateAction implements DumbAware {
    public static final String FILE_TEMPLATE = "ASP File.lp";
    public static final String APPLICATION_TEMPLATE = ASPLanguage.INSTANCE.getDisplayName() + " Application";

    private static final String NEW_ASP_FILE = "New " + ASPLanguage.INSTANCE.getDisplayName() + " File";
    private static final String DEFAULT_ASP_TEMPLATE_PROPERTY = "DefaultASPTemplateProperty";

    public ASPCreateFile() {
        super(NEW_ASP_FILE, "", ASPIcons.FILE);
    }

    @Override
    protected void buildDialog(Project project, PsiDirectory directory, @NotNull CreateFileFromTemplateDialog.Builder builder) {
        builder.setTitle(NEW_ASP_FILE)
                .addKind("Empty file", ASPIcons.FILE, FILE_TEMPLATE);
    }

    @NotNull
    @Override
    protected String getDefaultTemplateProperty() {
        return DEFAULT_ASP_TEMPLATE_PROPERTY;
    }

    @NotNull
    @Override
    protected String getActionName(PsiDirectory directory, String newName, String templateName) {
        return NEW_ASP_FILE;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ASPCreateFile;
    }
}
