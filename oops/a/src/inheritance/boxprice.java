package inheritance;

public class boxprice extends boxweight{
    double cost;

    boxprice(){
        super();
        this.cost=-1;
    }
    boxprice(double side,double weight,double cost){
        super(side,weight);
        this.cost=cost;
    }


    boxprice(double l,double w,double h,double weight,double cost){
        super(l,w,h,weight);
        this.cost=cost;


    }

}
