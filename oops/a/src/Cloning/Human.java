package Cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age,String name){
        this.age=age;
        this.name=name;
        this.arr=new int[]{3,4,5,3,2};

    }
    public Human(Human other){
        this.age=other.age;
        this.name=other.name;
    }
    public Object clone() throws CloneNotSupportedException{
        Human Twin=(Human)super.clone();//shallow copying

        //deep copy
        Twin.arr=new int[Twin.arr.length];

        for(int i=0;i<Twin.arr.length;i++){
            Twin.arr[i]=this.arr[i];

        }
        return Twin;


    }
}
