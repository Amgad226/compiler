package nodes;

/*
* */

public class DoWhileStatement extends  Statement {
    public Condition condition;
    public Block block;
    public DoWhileStatement(Condition condition,Block block)
    {
        this.condition= condition;
        this.block = block;
    }

    @Override
    public String toString() {


        return "do"  + block.toString()  +'\n'+  "while"+'(' + condition.toString() + ')';
    }
}
/*
  do{
  }
 while(true);
*/


