package remipassmoilesel;

import java.util.ArrayList;
import java.util.List;

/**
 * LCD display that can be used in terminal console
 */
public class ConsoleLcdDisplay extends LcdDisplay {

    private static final String SPACE = "   ";
    private final ArrayList<DisplayableChar> displayUnits;

    public ConsoleLcdDisplay(int displayUnitNumber) {
        super(displayUnitNumber);
        this.displayUnits = new ArrayList(displayUnitNumber);
    }

    @Override
    public void setCharAt(int displayUnitId, DisplayableChar charToDisplay) {
        displayUnits.add(displayUnitId, charToDisplay);
    }

    @Override
    public void print() {
        System.out.println("----- CLEAR CONSOLE -------");

        int lineNumber = displayUnits.get(0).getRawChars().size();
        for (int i = 0; i < lineNumber; i++) {
            for (DisplayableChar charr : displayUnits) {
                List<String> line = charr.getRawChars().get(i);
                for (String s : line) {
                    System.out.print(s);
                }
                System.out.print(SPACE);
            }

            // new line
            System.out.println(SPACE);
        }

    }

    @Override
    public void resetAll() {
        displayUnits.clear();
    }
}
