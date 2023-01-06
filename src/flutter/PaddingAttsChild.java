package flutter;

public class PaddingAttsChild extends PaddingAtts{
    String object ;

    public PaddingAttsChild(String object) {
        this.object = object;
    }
    @Override
    public String toString() {
        return "child:" +object.toString() ;

    }

}
