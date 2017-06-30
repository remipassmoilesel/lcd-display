package remipassmoilesel.numbers;

import remipassmoilesel.DisplayableChar;

import java.util.Arrays;

/**
 * The number one !
 */
public class Number2 extends DisplayableChar {

    public Number2(){
        super('2');
        rawChars = Arrays.asList(
                Arrays.asList(BLANK, HORIZ_BAR, BLANK),
                Arrays.asList(BLANK, HORIZ_BAR, VERT_BAR),
                Arrays.asList(VERT_BAR, HORIZ_BAR, BLANK)
        );
    }

}
