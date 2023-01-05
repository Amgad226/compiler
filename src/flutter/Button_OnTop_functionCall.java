package flutter;

import nodes.FunctionCall;

public class Button_OnTop_functionCall extends Button_OnTop{
    public FunctionCall functionCall;
    public Button_OnTop_functionCall(FunctionCall functionCall){
        this.functionCall=functionCall;
    }

    @Override
    public String toString() {
        return "ON_TAP:" + functionCall.toString();
    }
}
