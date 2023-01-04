package nodes;

public class Type extends Node {
     String type ;
     public  Type(String type ){
         this.type= type;
     }

    @Override
    public String toString() {
        return  type ;
    }



}
