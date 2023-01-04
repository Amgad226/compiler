package nodes;

public class AdditionExpression extends  Expression {
    Expression left;
    Expression right;
    public AdditionExpression( Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public String toString() {
        return left.toString() +" + "+right.toString();
    }


}
