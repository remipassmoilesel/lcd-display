package remipassmoilesel;

import junit.framework.TestCase;

/**
 * Created by remipassmoilesel on 30/06/17.
 */
public class LcdDisplayControllerTest extends TestCase {

    public void test() {

        LcdDisplayController lcdController = new LcdDisplayController();

        // test creation
        int size = 5;
        lcdController.newScreen(size);
        ConsoleLcdDisplay currentScreen = (ConsoleLcdDisplay) lcdController.getCurrentScreen();
        assertTrue(currentScreen != null);
        assertTrue(currentScreen.getSize() == size);

        // test normal display
        String testString = "1111";
        lcdController.displayString(testString);
        assertTrue(currentScreen.getDisplayUnits().size() == testString.length());

    }
    
}
