package nodes;

public class Increment extends  Node {
    Expression expression;
    String symbol ;
    String id ; // identifire
//    : ID ('+=' | '-=' | '*=' | '/=') expression

    public  Increment ( String id ,String symbol ,Expression expression){
        this.id = id ;
        this.symbol=symbol;
        this.expression=expression;
    }

    @Override
    public String toString() {
        return id +symbol + expression.toString();
    }
}
