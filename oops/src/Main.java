import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {
    //Student student1 =new Student();
    //Student student2=new Student(15,"rajesh",78.4f);
        Student student2=new Student();

       // student1.changeName();
    //student1.greeting();

    System.out.println(student2.rno);

    }
    static class Student{
        int rno;
        String name;
        float  marks;

       /* Student(){
            this.rno=12;
            this.name="virat";
            this.marks=45.6f;

        }*/
        //calling a constructor from a  constructor

        Student(){
            this(16,"dil",65.34f);
        }
        Student(int roll,String name,float mar){
            this.rno=roll;
            this.name=name;
            this.marks=mar;
        }
        void greeting(){
            System.out.println("hi my name is "+name);
        }
        void changeName(){
            name="kohli";
        }


    }

}