package remipassmoilesel;

import java.util.List;

/**
 * Control a lcd display
 */
public class LcdDisplayController {

    private LcdDisplay currentScreen;

    public LcdDisplayController() {
        this.currentScreen = null;
    }

    public void setCurrentScreen(LcdDisplay screen) {
        currentScreen = screen;
    }

    public LcdDisplay newScreen(int size) {
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

        if (stringToDisplay == null) {
            throw new RuntimeException("String cannot be null");
        }

        if (stringToDisplay.length() > currentScreen.getSize()) {
            throw new RuntimeException("String is too long. Actual: " + stringToDisplay.length() + " Max: " + currentScreen.getSize());
        }

        currentScreen.resetAll();

        List<DisplayableChar> chars = DisplayableChar.getAvailableDisplayableChars();

        for (int i = 0; i < stringToDisplay.length(); i++) {

            String charToDisplay = stringToDisplay.substring(i, i + 1);

            boolean found = false;
            for (DisplayableChar c : chars) {
                if (c.getValue().equals(charToDisplay)) {
                    currentScreen.setCharAt(i, c);
                    found = true;
                    break;
                }
            }

            if (found == false) {
                throw new RuntimeException("Unknown character: " + charToDisplay);
            }

        }

        currentScreen.print();

    }

    private void checkCurrentScreen() {
        if (currentScreen == null) {
            throw new RuntimeException("You must init screen with newScreen() method before print something");
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
