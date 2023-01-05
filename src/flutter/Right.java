package flutter;

import nodes.PositiveInteger;

public class Right  extends CostumeValues {
    PositiveInteger number;
    public Right(PositiveInteger number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "right:"+number.toString();
    }
}