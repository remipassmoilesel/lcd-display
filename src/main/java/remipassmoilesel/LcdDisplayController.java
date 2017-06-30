package remipassmoilesel;

import remipassmoilesel.numbers.Number1;

import java.util.List;

/**
 * Control a lcd display
 */
public class LcdDisplayController {

    public static final int MIN_SCREEN_SIZE = 5;

    private LcdDisplay currentScreen;


    public LcdDisplayController() {
        this.currentScreen = null;
    }

    public LcdDisplay newScreen(int size) {

        if (size < MIN_SCREEN_SIZE) {
            throw new RuntimeException("Size must be > 5");
        }

        currentScreen = new ConsoleLcdDisplay(size);
        return currentScreen;
    }

    /**
     * Reset the current screen and display a string
     *
     * @param stringToDisplay
     */
    public void displayString(String stringToDisplay) {

        checkCurrentScreen();

        if(stringToDisplay == null){
            throw new RuntimeException("String cannot be null");
        }

        if(stringToDisplay.length() > currentScreen.getSize()){
            throw new RuntimeException("String is too long. Actual: " + stringToDisplay.length() + " Max: " + currentScreen.getSize());
        }

        currentScreen.resetAll();

        List<Number1> chars = DisplayableChar.getAvailableDisplayableChars();

        for (int i = 0; i < stringToDisplay.length(); i++) {

            String charToDisplay = stringToDisplay.substring(i, i + 1);

            for (DisplayableChar c : chars){
                if(c.getValue().equals(charToDisplay)){
                    currentScreen.setCharAt(i, c);
                    break;
                }
            }

        }

        currentScreen.print();

    }

    private void checkCurrentScreen() {
        if(currentScreen == null){
            throw new RuntimeException("Yu must init screen with newScreen() method before print something");
        }
    }

    /**
     * Clear current screen
     */
    public void resetCurrentScreen() {
        checkCurrentScreen();
        currentScreen.resetAll();
    }

    public LcdDisplay getCurrentScreen() {
        checkCurrentScreen();
        return currentScreen;
    }
}
