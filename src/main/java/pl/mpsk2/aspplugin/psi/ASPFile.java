package pl.mpsk2.aspplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl.mpsk2.aspplugin.ASPFileType;
import pl.mpsk2.aspplugin.ASPLanguage;
import pl.mpsk2.aspplugin.psi.statement.ASPStatement;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

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

    @NotNull
    public List<ASPStatement> getStatements() {
        ASPProgram program = PsiTreeUtil.getChildOfType(this, ASPProgram.class);
        if (program == null) {
            return new ArrayList<>();
        }
        return PsiTreeUtil.getChildrenOfTypeAsList(program, ASPStatement.class);
    }

    @Nullable
    public ASPDefine getDefine() {
        return PsiTreeUtil.getChildOfType(this, ASPDefine.class);
    }
}
