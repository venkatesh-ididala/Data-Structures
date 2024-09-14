package staticexample;

import java.sql.SQLOutput;

public class stat {
    public static void main(String[] args) {
        Human person = new Human(18, "virat", 20000, true);
        Human person2 = new Human(12, "kohli", 30030, false);
        //static variable can be accessed with or without object
        System.out.println(Human.population);
        fun();


    }
        //non-static inside a static
        static void fun(){
            System.out.println("hi this is a static method");
            stat obj=new stat();
            obj.greeting();

        }
       /* void greeting() {
        System.out.println("this gives error");

    }*/

    //all non-static methods have instances of the class
       void greeting() {
           System.out.println("this gives output");
           //fun();  ---> in non-static context we can access static methods

       }

}

