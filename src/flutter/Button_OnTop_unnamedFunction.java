package flutter;

import nodes.UnnamedFunction;

public class Button_OnTop_unnamedFunction extends Button_OnTop{
   public UnnamedFunction unnamedFunction;
   public Button_OnTop_unnamedFunction(UnnamedFunction unnamedFunction){
       this.unnamedFunction=unnamedFunction;
   }

    @Override
    public String toString() {
        return "ON_TAP:" + unnamedFunction.toString();
    }
}
