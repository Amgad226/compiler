package flutter;
//import enums.StackFit;

public class ImageFit extends ImageAtts{
    public   enums.BoxFit imageFit ;
    public ImageFit(enums.BoxFit imageFit ){
        this.imageFit= imageFit;
    }

    @Override
    public String toString() {
        return  "fit:BoxFit."+BoxFit.toString();
    }
}
//    : FIT':'STACK_FIT COMMA?
