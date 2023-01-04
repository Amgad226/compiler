package nodes;

public class ForStatement extends Statement{

    InitialCondition initialCondition;
    Condition condition;
    Increment increment;
    Block block ;
    public ForStatement(InitialCondition initialCondition,Condition condition,Increment increment ,Block block){
        this.initialCondition=initialCondition;
        this.condition=condition;
        this.increment=increment;
        this.block= block;
    }

    @Override
    public String toString() {
        return initialCondition.toString() + ";" + condition.toString() + ";" +increment.toString() +block.toString();
    }
}
