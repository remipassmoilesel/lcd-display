package remipassmoilesel.numbers;

import remipassmoilesel.DisplayableChar;

import java.util.Arrays;

/**
 * The number one !
 */
public class Number4 extends DisplayableChar {

    public Number4(){
        super('4');
        rawChars = Arrays.asList(
                Arrays.asList(BLANK, BLANK, BLANK),
                Arrays.asList(VERT_BAR, HORIZ_BAR, VERT_BAR),
                Arrays.asList(BLANK, BLANK, VERT_BAR)
        );
    }

}
