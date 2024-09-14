package Generics.Comparing;

public class student  implements Comparable<student>{
    int roll_no;
    float marks;

    public student(int r,float m){
        this.roll_no=r;
        this.marks=m;
    }
    public int compareTo(student o){
        int diff=(int)(this.marks-o.marks);
        //if diff==0 then marks are same
        //if diff >0 o is bigger or else o is smaller
        return diff;


    }
}
