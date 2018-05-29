package pl.mpsk2.aspplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import pl.mpsk2.aspplugin.ASPFileType;
import pl.mpsk2.aspplugin.ASPLanguage;

import javax.swing.*;

public class ASPFile extends PsiFileBase {
    public ASPFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ASPLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return ASPFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Answer Set Programming file";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
