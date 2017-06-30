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

        lcdController.displayString("11");
        lcdController.displayString("1111");
        lcdController.displayString("1112");

    }
}
