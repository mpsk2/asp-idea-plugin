package pl.mpsk2.aspplugin.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import pl.mpsk2.aspplugin.ASPLanguage;
import pl.mpsk2.aspplugin.lexer.ASPLexerAdapter;
import pl.mpsk2.aspplugin.psi.ASPFile;
import pl.mpsk2.aspplugin.psi.ASPTypes;

public class ASPParserDefinition implements ParserDefinition {
    public static final TokenSet COMMENTS = TokenSet.create(ASPTypes.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(ASPLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new ASPLexerAdapter();
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new ASPParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new ASPFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return ASPTypes.Factory.createElement(node);
    }
}
