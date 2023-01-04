package nodes;

public class InitialCondition extends Node{


   /*
   0: ID
   1: ID = expression
   2: type ID = expression

   */

    String type; // int , flout, double, ...
    Expression expression;
    String id ; // identifire
    int diction; //هراء من عنا
    public InitialCondition(String type,Expression expression , String id ){
        if(expression ==null){
            this.id =id ;
            this.diction=0;

        }
        else if (type==null){
            this.id= id ;
            this.expression=expression;
            this.diction=1;

        }
        else{
            this.type= type;
            this.id= id ;
            this.expression=expression;
            this.diction=2;
        }



    }

    @Override
    public String toString() {
        if(diction==0){
            return id;
        }

        else if (diction==1){
            return id + "=" +expression.toString() ;
        }

        else{
            return type  + id + "=" +expression.toString() ;
        }


    }



}
