package remipassmoilesel.numbers;

import remipassmoilesel.DisplayableChar;

import java.util.Arrays;

/**
 * The number one !
 */
public class Number8 extends DisplayableChar {

    public Number8(){
        super('8');
        rawChars = Arrays.asList(
                Arrays.asList(BLANK, HORIZ_BAR, BLANK),
                Arrays.asList(VERT_BAR, BLANK, VERT_BAR),
                Arrays.asList(VERT_BAR, HORIZ_BAR, VERT_BAR)
        );
    }

}
