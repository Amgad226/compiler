package nodes;

public class SubtractExpression extends Expression {
    Expression left;
    Expression right;
    public SubtractExpression( Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public String toString() {
        return left.toString() +" - "+right.toString();
    }
}
