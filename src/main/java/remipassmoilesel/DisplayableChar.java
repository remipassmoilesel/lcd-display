package remipassmoilesel;

import remipassmoilesel.numbers.Number1;

import java.util.Arrays;
import java.util.List;

/**
 * Char with a value (the real world char) and with a list of raw chars used to represent the real world char.
 */
public abstract class DisplayableChar {

    public static final String HORIZ_BAR = "_";
    public static final String VERT_BAR = "|";
    public static final String BLANK = " ";

    /**
     * Real world value
     */
    protected String value;

    /**
     * Chars used to display the real world value
     */
    protected List<List<String>> rawChars;

    public DisplayableChar(char value) {
        this.value = Character.toString(value);
    }

    public List<List<String>> getRawChars() {
        return rawChars;
    }

    public String getValue() {
        return value;
    }


    /**
     * Return a list of all available real world chars
     * @return
     */
    public static List<Number1> getAvailableDisplayableChars() {
        // TODO: find a better way, introspection ?
        return Arrays.asList(new Number1());
    }

}
