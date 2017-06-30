package remipassmoilesel.numbers;

import remipassmoilesel.DisplayableChar;
import remipassmoilesel.DisplayableChar.*;

import java.util.Arrays;

/**
 * The number one !
 */
public class Number1 extends DisplayableChar {

    public Number1(){
        super('1');
        rawChars = Arrays.asList(
                Arrays.asList(BLANK, BLANK, VERT_BAR),
                Arrays.asList(BLANK, BLANK, VERT_BAR),
                Arrays.asList(BLANK, BLANK, VERT_BAR)
        );
    }

}
