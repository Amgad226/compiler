package nodes;

public class doWhileStatement extends WhileStatement{

    public doWhileStatement(Condition condition, Block block){
        super(condition, block);
    }

    @Override
    public String toString() {
        return "do" + '\n' + block.toString() + "while" + '(' + condition.toString() + ");" ;
    }
}
