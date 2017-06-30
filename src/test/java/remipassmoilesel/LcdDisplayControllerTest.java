package remipassmoilesel;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by remipassmoilesel on 30/06/17.
 */
public class LcdDisplayControllerTest {

    @Test
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

    @Test(expected = RuntimeException.class)
    public void test2(){
        LcdDisplayController lcdController = new LcdDisplayController();
        lcdController.newScreen(2);
    }

    @Test(expected = RuntimeException.class)
    public void test3(){
        LcdDisplayController lcdController = new LcdDisplayController();
        lcdController.displayString("Hey hey !");
    }

    @Test(expected = RuntimeException.class)
    public void test4(){
        LcdDisplayController lcdController = new LcdDisplayController();
        lcdController.newScreen(5);
        lcdController.displayString("Hey hey !");
    }

}
