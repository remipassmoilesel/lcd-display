package remipassmoilesel.numbers;

import remipassmoilesel.DisplayableChar;

import java.util.Arrays;

/**
 * The number one !
 */
public class Number5 extends DisplayableChar {

    public Number5(){
        super('5');
        rawChars = Arrays.asList(
                Arrays.asList(BLANK, HORIZ_BAR, BLANK),
                Arrays.asList(VERT_BAR, HORIZ_BAR, BLANK),
                Arrays.asList(BLANK, HORIZ_BAR, VERT_BAR)
        );
    }

}
