package flutter;

import nodes.PositiveInteger;

public class ContainerAttsHeight extends ContainerAtts{
    PositiveInteger number ;
    public ContainerAttsHeight(PositiveInteger number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "height:"+number.toString();
    }
}
