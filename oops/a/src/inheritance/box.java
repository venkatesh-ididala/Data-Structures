package inheritance;

public class box {
    double l;
    double w;
    double h;

    box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }
    box(double l,double w,double h ){
        this.l=l;
        this.w=w;
        this.h=h;
    }
}
