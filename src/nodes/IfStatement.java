package nodes;

import java.util.ArrayList;
import java.util.List;

public class IfStatement extends Statement{
    public Condition condition;
    public Block block;
    public List<ElseIf> elseIfs;
    public Else anElse;

    public IfStatement(Condition condition, Block block, List<ElseIf> elseIfs, Else anElse){
        this.condition = condition;
        this.block = block;
        this.elseIfs = new ArrayList<>();
        if(elseIfs != null){
            this.elseIfs = elseIfs;
            this.anElse = anElse;
        }
        else if(anElse != null){
            this.anElse = anElse;
        }else{
            this.elseIfs = new ArrayList<>();
        }
    }

    @Override
    public String toString() {
        return "if" + '(' + condition.toString() + ')' + '\n' + block.toString();
    }
}
