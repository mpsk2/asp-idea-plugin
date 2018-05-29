package pl.mpsk2.aspplugin.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import pl.mpsk2.aspplugin.lexer.ASPLexerAdapter;
import pl.mpsk2.aspplugin.parser.ASPParserDefinition;
import pl.mpsk2.aspplugin.psi.ASPTypes;

import java.util.HashMap;
import java.util.Map;

import static pl.mpsk2.aspplugin.highlighting.ASPSyntaxHighlightingColors.*;

public class ASPSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<IElementType, TextAttributesKey>();
    
    static {
        fillMap(ATTRIBUTES, COMMENT, ASPTypes.COMMENT);
        fillMap(ATTRIBUTES, PARENTHESES, ASPTypes.LPAREN, ASPTypes.RPAREN);
        fillMap(ATTRIBUTES, BRACES, ASPTypes.LBRACE, ASPTypes.RBRACE);
        fillMap(ATTRIBUTES, BRACKETS, ASPTypes.LBRACK, ASPTypes.RBRACK);
        fillMap(ATTRIBUTES, IDENTIFIER, ASPTypes.IDENTIFIER);
        fillMap(ATTRIBUTES, DOT, ASPTypes.DOT, ASPTypes.DOTS);
        fillMap(ATTRIBUTES, COLON, ASPTypes.COLON);
        fillMap(ATTRIBUTES, COMMA, ASPTypes.COMMA);
        fillMap(ATTRIBUTES, KEYWORD,
                ASPTypes.BASE,
                ASPTypes.CONST,
                ASPTypes.COUNT,
                ASPTypes.CUMULATIVE,
                ASPTypes.DISJOINT,
                ASPTypes.EXTERNAL,
                ASPTypes.FALSE,
                ASPTypes.FORGET,
                ASPTypes.INCLUDE,
                ASPTypes.INFIMUM,
                ASPTypes.MAX,
                ASPTypes.MAXIMIZE,
                ASPTypes.MIN,
                ASPTypes.MINIMIZE,
                ASPTypes.SHOW,
                ASPTypes.SHOWSIG,
                ASPTypes.EDGE,
                ASPTypes.PROJECT_,
                ASPTypes.HEURISTIC,
                ASPTypes.SUM,
                ASPTypes.SUMP,
                ASPTypes.SUPREMUM,
                ASPTypes.TRUE,
                ASPTypes.BLOCK,
                ASPTypes.VOLATILE,
                ASPTypes.THEORY
        );
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new ASPLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(ATTRIBUTES.get(tokenType));
    }
}
