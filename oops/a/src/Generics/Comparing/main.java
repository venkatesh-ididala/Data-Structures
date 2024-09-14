package Generics.Comparing;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        student s=new student(2,4323.f);
        student st=new student(4,143.f);
        student stu=new student(4,32.f);
        student stud=new student(2,893.f);
        student stude=new student(2,223.f);

        student[] list={s,st,stu,stud,stude};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));


        if(s.compareTo(st)<0){ //here comparison of objects confuses that which parameter has to compare
            System.out.println("st is bigger than s");
        }
    }
}
