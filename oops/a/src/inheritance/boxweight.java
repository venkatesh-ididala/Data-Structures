package inheritance;

public class boxweight  extends  box{
    double weight;
    boxweight(){
        this.weight=-1;

    }
    boxweight(double side,double weight){
       super(side);
       this.weight=weight;

    }

    boxweight(double l,double w,double h,double weight){
        super(l,w,h);
        this.weight=weight;

    }

}
