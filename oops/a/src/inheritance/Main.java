package inheritance;

public class Main {
    public static void main(String[] args) {
        box b=new box();
        System.out.println(b.l);
        boxweight bw=new boxweight();

        System.out.println(bw.w);
        boxweight bb=new boxweight(2,4,4,6);
        System.out.println(bb.l+ " "+bb.weight);

        //the reference  of the object is preferred over the object is referencing to
        box b1=new boxweight(5,3);
       // System.out.println(b1.weight);  ---->can`t be accessed
        System.out.println(b1.l);

        //there are many variables in the child and parent class
        //you are given access to the variables that are in the ref type(boxweight)
        //you should access the variable weight
        //but weight have to be initialized inside the  parent class bcz constructor is  called
        //boxweight box2=new box(2,4,5);
       // System.out.println(box2.w);

        boxprice bp=new boxprice(3,4,500);
        System.out.println(bp.cost);

    }

}
