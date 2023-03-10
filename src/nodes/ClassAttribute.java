package nodes;

public class ClassAttribute extends Node {
    public Boolean isStatic;
    public Declaration declaration;

    public ClassAttribute(Boolean isStatic, Declaration declaration){
        this.isStatic = isStatic;
        this.declaration = declaration;
    }

    @Override
    public String toString() {
        if(isStatic){
            return "static" + " " + declaration.toString();
        }else {
            return declaration.toString();
        }
    }
}
