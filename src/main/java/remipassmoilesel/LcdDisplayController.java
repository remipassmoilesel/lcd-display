package remipassmoilesel;

import remipassmoilesel.numbers.Number1;

import java.util.Arrays;
import java.util.List;

/**
 * Control a lcd display
 */
public class LcdDisplayController {

    private LcdDisplay currentScreen;

    public LcdDisplayController() {
        this.currentScreen = null;
    }

    public LcdDisplay newScreen(int size) {

        if (size < 5) {
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

        currentScreen.resetAll();

        List<Number1> chars = getAvailableDisplayableChars();

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

    /**
     * Return a list of all available real world chars
     * @return
     */
    private List<Number1> getAvailableDisplayableChars() {
        // TODO: find a better way, introspection ?
        return Arrays.asList(new Number1());
    }

    /**
     * Clear current screen
     */
    public void resetCurrentScreen() {
        currentScreen.resetAll();
    }


}
