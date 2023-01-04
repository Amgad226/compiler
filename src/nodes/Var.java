package nodes;

public class Var extends Node{
    String var;
    public Var (String var ){
        this.var= var;
    }

    @Override
    public String toString() {
        return  var ;
    }
}
