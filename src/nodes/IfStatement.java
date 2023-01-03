package nodes;

import java.util.List;

public class IfStatement extends Statement{
    public Condition condition;
    public Block block;
    public List<ElseIf> elseIfs;
    public Else anElse;

    public IfStatement(Condition condition, Block block){
        this.condition = condition;
        this.block = block;
    }

    @Override
    public String toString() {
        return "if" + '(' + condition.toString() + ')' + '\n' + block.toString();
    }
}
