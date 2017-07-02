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

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            printHelp();
            return;
        }

        // display time
        if (cmd.hasOption("t")) {

            LcdDisplayController lcdController = new LcdDisplayController();

            String firstTime = String.valueOf(System.currentTimeMillis());
            ConsoleLcdDisplay screen = new ConsoleLcdDisplay(firstTime.length());
            lcdController.setCurrentScreen(screen);

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


        } else {
            printHelp();
        }

    }

    private static void log(Throwable e) {
        e.printStackTrace();
        System.exit(1);
    }

    private static void printHelp() {
        println("LcdDisplay: ");
        println("   -t              : count time");
        println("   -d abcdef123    : display abcdef123");
    }

    private static void println(String s) {
        System.out.println(s);
    }

}
