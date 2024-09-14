package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class intro {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("virat",88);
        map.put("kohli",99);
        map.put("chiku",89);

        //System.out.println(map.get("virat"));
        System.out.println(map);


        HashSet<Integer> m=new HashSet<>();
        m.add(99);
        m.add(65);
        m.add(45);
        m.add(454);
        m.add(99);
        m.add(99);

        System.out.println(m);


        TreeMap<String ,Integer> t=new TreeMap<>();
        t.put("k",78);
        t.put("g",89);
        t.put("e",23424);

        System.out.println(t);

    }
}
