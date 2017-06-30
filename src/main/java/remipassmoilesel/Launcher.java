package remipassmoilesel;

/**
 * Small examples of how work this LCD screen implementation
 *
 */
public class Launcher
{
    public static void main(String[] args) {

        LcdDisplayController lcdController = new LcdDisplayController();

        lcdController.newScreen(10);

        lcdController.displayString("01");
        lcdController.displayString("01234");
        lcdController.displayString("0123456789");

    }
}
