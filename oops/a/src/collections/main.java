package collections;
import java.sql.Array;
import java.util.*;
//import java.util.List;
//import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new LinkedList<>();

        list2.add(23);
        list2.add(21);
        System.out.println(list2);


        List<Integer> vector=new Vector<>();
        vector.add(22);
        vector.add(78);
        vector.add(67);

        System.out.println(vector);

    }


}
