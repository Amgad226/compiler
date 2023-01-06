package flutter;

import nodes.FunctionCall;

public class Inkwell_OnTap_functionCall extends Inkwell_OnTap{
    public FunctionCall functionCall;
    public void Inkwell_OnTop_functionCall(FunctionCall functionCall){
        this.functionCall=functionCall;
    }

    @Override
    public String toString() {
        return "ON_TAP:" + functionCall.toString();
    }
}
