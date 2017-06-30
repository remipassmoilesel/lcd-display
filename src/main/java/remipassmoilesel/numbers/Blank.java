package remipassmoilesel.numbers;

import remipassmoilesel.DisplayableChar;

import java.util.Arrays;

/**
 * The number one !
 */
public class Blank extends DisplayableChar {

    public Blank(){
        super(' ');
        rawChars = Arrays.asList(
                Arrays.asList(BLANK, BLANK, BLANK),
                Arrays.asList(BLANK, BLANK, BLANK),
                Arrays.asList(BLANK, BLANK, BLANK)
        );
    }

}
