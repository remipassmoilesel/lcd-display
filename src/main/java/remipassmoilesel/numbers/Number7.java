package remipassmoilesel.numbers;

import remipassmoilesel.DisplayableChar;

import java.util.Arrays;

/**
 * The number one !
 */
public class Number7 extends DisplayableChar {

    public Number7(){
        super('7');
        rawChars = Arrays.asList(
                Arrays.asList(BLANK, HORIZ_BAR, BLANK),
                Arrays.asList(BLANK, BLANK, VERT_BAR),
                Arrays.asList(BLANK, BLANK, VERT_BAR)
        );
    }

}
