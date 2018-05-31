package pl.mpsk2.aspplugin.parser;

import com.intellij.core.CoreApplicationEnvironment;
import com.intellij.lang.LanguageExtensionPoint;
import com.intellij.lang.ParserDefinition;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.testFramework.ParsingTestCase;
import org.jetbrains.annotations.NotNull;
import pl.mpsk2.aspplugin.ASPFileType;

abstract public class ASPParserTestBase extends ParsingTestCase {
    protected static final boolean CHECK_ERRORS = true;

    public ASPParserTestBase(String dataPath) {
        super(dataPath, ASPFileType.INSTANCE.getDefaultExtension(), new ASPParserDefinition());
    }

    @NotNull
    @Override
    protected String getTestDataPath() {
        return "testData/parser";
    }

    @Override
    protected boolean skipSpaces() {
        return true;
    }

    protected void doTest() {
        super.doTest(true);
        if (CHECK_ERRORS) {
            assertFalse(
                    "PsiFile contains error elements",
                    toParseTreeText(myFile, skipSpaces(), includeRanges()).contains("PsiErrorElement")
            );
        }
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        CoreApplicationEnvironment.registerExtensionPoint(
                Extensions.getRootArea(),
                "com.intellij.lang.braceMatcher",
                LanguageExtensionPoint.class
        );
    }
}
