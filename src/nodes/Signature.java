package nodes;

import enums.VoidOrType;

public class Signature extends Node{
    public VoidOrType returnType;
    public String id;
    public Arguments arguments;

    public Signature(VoidOrType returnType, String id, Arguments arguments){
        this.returnType = returnType;
        this.id = id;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return returnType.toString() + " " + id + " " + arguments.toString();
    }
}
