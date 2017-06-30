package remipassmoilesel;

/**
 * Abstract class representing a lcd display, composed of display units
 */
public abstract class LcdDisplay {

    protected int displayUnitNumber;

    public LcdDisplay(int displayUnitNumber) {
        this.displayUnitNumber = displayUnitNumber;
    }

    public int getSize() {
        return displayUnitNumber;
    }

    public abstract void setCharAt(int displayUnitId, DisplayableChar charToDisplay);

    public abstract void print();

    public abstract void resetAll();

}
