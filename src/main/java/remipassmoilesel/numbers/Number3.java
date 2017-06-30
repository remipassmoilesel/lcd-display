package remipassmoilesel.numbers;

import remipassmoilesel.DisplayableChar;

import java.util.Arrays;

public class Number3 extends DisplayableChar {

    public Number3(){
        super('3');
        rawChars = Arrays.asList(
                Arrays.asList(BLANK, HORIZ_BAR, BLANK),
                Arrays.asList(BLANK, HORIZ_BAR, VERT_BAR),
                Arrays.asList(BLANK, HORIZ_BAR, VERT_BAR)
        );
    }

}
