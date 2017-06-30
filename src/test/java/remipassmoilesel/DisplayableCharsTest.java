package remipassmoilesel;

import junit.framework.TestCase;

/**
 *
 */
public class DisplayableCharsTest extends TestCase {

    public void test() {

        for (DisplayableChar charr : DisplayableChar.getAvailableDisplayableChars()) {
            assertTrue(charr.getValue() != null);
            assertTrue(charr.getValue().length() == 1);

            assertTrue(charr.getRawChars() != null);
            assertTrue(charr.getRawChars().size() > 1);
        }

    }
}
