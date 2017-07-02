package remipassmoilesel;

import org.apache.commons.cli.*;

/**
 * Small examples of how work this LCD screen implementation
 */
public class Launcher {

    public static void main(String[] args) {
        parse(args);
        //simpleExample();
    }

    public static void simpleExample() {

        LcdDisplayController lcdController = new LcdDisplayController();

        ConsoleLcdDisplay screen = new ConsoleLcdDisplay(10);
        lcdController.setCurrentScreen(screen);

        lcdController.displayString("01");
        lcdController.displayString("01234");
        lcdController.displayString("0123456789");
        lcdController.displayString("01  56 789");

    }

    public static void parse(String[] args) {

        Options options = new Options();
        options.addOption("t", false, "display current time");
        options.addOption("d", false, "display digits");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            printHelp(e);
            return;
        }

        LcdDisplayController lcdController = new LcdDisplayController();

        String firstTime = String.valueOf(System.currentTimeMillis());
        ConsoleLcdDisplay screen = new ConsoleLcdDisplay(firstTime.length());
        lcdController.setCurrentScreen(screen);

        // display time
        if (cmd.hasOption("t")) {

            println("Press CTRL + C to stop");
            println("-------------------");
            println("");

            try {

                Thread.sleep(1000);

                while (true) {
                    Thread.sleep(200);
                    lcdController.displayString(String.valueOf(System.currentTimeMillis()));
                }
            } catch (InterruptedException e) {
                log(e);
            }


        }

        // Blink mode, netscape is back
        else if (cmd.hasOption("d")) {

            if (args.length < 2) {
                println("You must specify digits. Example: -d 123456789");
                printHelp(null);
                return;
            }

            println("Press CTRL + C to stop");
            println("-------------------");
            println("");

            String toDisplay = args[1];

            try {

                Thread.sleep(1000);

                lcdController.blink(5, toDisplay);

                Thread.sleep(1000);

                for (int i = 0; i < 5; i++) {

                    lcdController.leftToRight(toDisplay);
                    lcdController.rightToLeft(toDisplay);
                }

            } catch (InterruptedException e) {
                log(e);
            }


        } else {
            printHelp(null);
        }

    }

    private static void log(Throwable e) {
        e.printStackTrace();
        System.exit(1);
    }

    private static void printHelp(Throwable e) {
        println("LcdDisplay: ");
        println("   -t           : count time");
        println("   -d 123456    : display 123456");

        if (e != null) {
            println("");
            println("Error: " + e.getMessage());
        }

    }

    private static void println(String s) {
        System.out.println(s);
        System.out.flush();
    }

}
