package pl.mpsk2.aspplugin.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class ASPLexerAdapter extends FlexAdapter {
    public ASPLexerAdapter() {
        super(new _ASPLexer());
    }
}
