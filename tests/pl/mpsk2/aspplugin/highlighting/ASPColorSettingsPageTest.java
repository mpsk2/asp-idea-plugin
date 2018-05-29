package pl.mpsk2.aspplugin.highlighting;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ASPColorSettingsPageTest extends TestCase {
    public void testDemoText() {
        ASPColorSettingsPage obj = new ASPColorSettingsPage();
        String demoText = obj.getDemoText();
        Set<String> knownElements = obj.getAdditionalHighlightingTagToDescriptorMap().keySet();

        Matcher m = Pattern.compile("</?(\\w+)>").matcher(demoText);
        while (m.find()) {
            String name = m.group(1);
            if (!knownElements.contains(name)) {
                Assert.fail("Unknown element \"" + m.group() + "\".");
            }
        }
    }
}
