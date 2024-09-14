package Cloning;

import java.util.Arrays;

public class main  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal=new Human(21,"chinnu");
        // Human Twin=new Human(kunal);

        Human Twin=(Human)kunal.clone();  //--->parsing the object to the class Human

        System.out.println(Twin.age+"     "+Twin.name);
        System.out.println(Arrays.toString(Twin.arr));
        Twin.arr[0]=50;
        System.out.println(Arrays.toString(kunal.arr));
        System.out.println(Arrays.toString(Twin.arr));


        //this is called shallow copy
    }

}
