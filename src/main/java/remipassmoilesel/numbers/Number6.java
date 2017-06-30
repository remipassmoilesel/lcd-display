package remipassmoilesel.numbers;

import remipassmoilesel.DisplayableChar;

import java.util.Arrays;

public class Number6 extends DisplayableChar {

    public Number6(){
        super('6');
        rawChars = Arrays.asList(
                Arrays.asList(BLANK, HORIZ_BAR, BLANK),
                Arrays.asList(VERT_BAR, HORIZ_BAR, BLANK),
                Arrays.asList(VERT_BAR, HORIZ_BAR, VERT_BAR)
        );
    }

}
