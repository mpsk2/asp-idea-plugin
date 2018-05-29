package pl.mpsk2.aspplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ASPFileType extends LanguageFileType {
    public static final ASPFileType INSTANCE = new ASPFileType();

    private ASPFileType() {
        super(ASPLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "ASP file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Answer Set Programming langugage file";
    }

    @NotNull
    @Override
    public Icon getIcon() {
        return ASPIcons.FILE;
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "lp";
    }
}