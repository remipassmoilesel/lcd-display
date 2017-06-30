package remipassmoilesel.numbers;

import remipassmoilesel.DisplayableChar;

import java.util.Arrays;

/**
 * The number one !
 */
public class Number9 extends DisplayableChar {

    public Number9(){
        super('9');
        rawChars = Arrays.asList(
                Arrays.asList(BLANK, HORIZ_BAR, BLANK),
                Arrays.asList(VERT_BAR, HORIZ_BAR, VERT_BAR),
                Arrays.asList(BLANK, BLANK, VERT_BAR)
        );
    }

}
