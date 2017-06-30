package remipassmoilesel;

/**
 * Small examples of how work this LCD screen implementation
 *
 */
public class Launcher
{
    public static void main(String[] args) {

        LcdDisplayController lcdController = new LcdDisplayController();

        lcdController.newScreen(5);

        lcdController.displayString("11111");
        lcdController.displayString("11111111");
        lcdController.displayString("11");

    }
}
