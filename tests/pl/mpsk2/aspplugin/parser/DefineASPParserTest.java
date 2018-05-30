package pl.mpsk2.aspplugin.parser;

public class DefineASPParserTest extends ASPParserTestBase {
    public DefineASPParserTest() {
        super("define");
    }

    public void testBig() { doTest(true); }
    public void testIdConstant() { doTest(true); }
    public void testT1() { doTest(true); }
}
