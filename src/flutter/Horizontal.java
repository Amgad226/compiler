package flutter;

import nodes.PositiveInteger;

public class Horizontal extends HorizontalOrVertical{
    PositiveInteger number ;
    public Horizontal(PositiveInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  "horizontal:"+number.toString();
    }
}
