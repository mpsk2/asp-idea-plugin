package pl.mpsk2.aspplugin.highlighting;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;
import pl.mpsk2.aspplugin.ASPIcons;
import pl.mpsk2.aspplugin.ASPLanguage;

import javax.swing.Icon;
import java.util.Map;

import static pl.mpsk2.aspplugin.highlighting.ASPSyntaxHighlightingColors.*;

public class ASPColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Comment", COMMENT),
            new AttributesDescriptor("String", STRING),
            new AttributesDescriptor("Identifier", IDENTIFIER),
            new AttributesDescriptor("Key words", KEYWORD)
    };
    private static final Map<String, TextAttributesKey> ATTRIBUTES_KEY_MAP = ContainerUtil.newTroveMap();

    static {
        ATTRIBUTES_KEY_MAP.put("kw", KEYWORD);
    }

    @NotNull
    @Override
    public Icon getIcon() {
        return ASPIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new ASPSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "// This is demo text\n" +
                "lubie :- placki.\n" +
                "d(X, Y, Z) :- f(X, Y), f(Y, Z)\n" +
                "// More\n" +
                "b :- not not y + z { optyk : okulary }.\n" +
                "#include \"fiel2\". #include < b >.\n" +
                "#external - nottoday : not #true .\n" +
                "#disjoint { optyk : abc $+ cde : not not #true } .\n" +
                "// Disjoint Statement\n" +
                "#disjoint {a:b $+ c: not #true} :- x,y,z(1,2,3).\n" +
                "\n" +
                "// WIf Statement\n" +
                ":~ d(X, 1), d(X, 2). [\n" +
                "    X @ 13\n" +
                "]\n" +
                "\n" +
                "// Minimize/Maximize Statement\n" +
                "#maximize {}.\n" +
                "#minimize {\n" +
                "    a @ b,c,d: ;\n" +
                "    d @ e,f,g : h, i, j\n" +
                "}.\n" +
                "\n" +
                "// Edge Statement\n" +
                "#edge ( a, b; c, d; e, f) :.\n" +
                "\n" +
                "// Heuristic Statement\n" +
                "#heuristic -abecadlo :.  [x + y + z @ a * b + c, d - e]\n" +
                "\n" +
                "// Project Statement\n" +
                "#project - xyz / 5.\n" +
                "// #project random $+ (x, y, z) :.\n" +
                "\n" +
                "// Define Statement\n" +
                "#const random = x + y + z.\n" +
                "\n" +
                "// Block Statement\n" +
                "#program veryBigProgram (\n" +
                "    x, y, z\n" +
                ").\n" +
                "#program otherBigProgram ().\n" +
                "#program verySmallProgram.\n" +
                "\n" +
                "// The end";
    }

    @NotNull
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return ATTRIBUTES_KEY_MAP;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return ASPLanguage.INSTANCE.getDisplayName();
    }
}
