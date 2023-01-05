package flutter;

import nodes.PositiveInteger;

public class Top extends Costume{
    PositiveInteger number;
    public Top(PositiveInteger number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "top:"+number.toString();
    }

}
