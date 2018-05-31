package pl.mpsk2.aspplugin.highlighting;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class ASPSyntaxHighlightingColors {
    public static final TextAttributesKey COMMENT = createTextAttributesKey("ASP_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey STRING = createTextAttributesKey("ASP_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("ASP_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey BRACKETS = createTextAttributesKey("ASP_BRACKET", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey BRACES = createTextAttributesKey("ASP_BRACES", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey PARENTHESES = createTextAttributesKey("ASP_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("ASP_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("ASP_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey DOT = createTextAttributesKey("ASP_DOT", DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey SEMICOLON = createTextAttributesKey("ASP_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey COLON = createTextAttributesKey("ASP_COLON", HighlighterColors.TEXT);
    public static final TextAttributesKey COMMA = createTextAttributesKey("ASP_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("ASP_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
}
