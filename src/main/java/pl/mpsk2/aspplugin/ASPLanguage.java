package pl.mpsk2.aspplugin;

import com.intellij.lang.Language;

public class ASPLanguage extends Language {
    public static final ASPLanguage INSTANCE = new ASPLanguage();

    private ASPLanguage() {
        super("Answer Set Programming");
    }
}