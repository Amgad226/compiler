package nodes;

public class ForeachStatement extends Statement{
    String  id; // i
    String  array; // i
    VarOrType varOrType ; // int / var
//    : FOREACH '(' varOrType ID 'in' ID ')' block
    Block block ;
    public ForeachStatement( String  id, String  array,VarOrType varOrType, Block block){
        this.id=id;
        this.array=array ;
        this.varOrType=varOrType;
        this.block = block;
    }

    @Override
    public String toString() {
        return "foreach(" +varOrType.toString() + id + "in"+ array + ")"+ block.toString();

    }
}
