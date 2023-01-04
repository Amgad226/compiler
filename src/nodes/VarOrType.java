package nodes;

public class VarOrType {
    Var var ;
    Type type ;
    public VarOrType(Var var){
        this.var= var;
    }
    public VarOrType(Type type){
        this.type= type;
    }

    @Override
    public String toString() {
        if(var ==null)
            return type.toString();
        else
            return var.toString() ;
    }
}
