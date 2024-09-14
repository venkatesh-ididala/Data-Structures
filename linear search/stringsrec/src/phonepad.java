import java.util.*;
public class phonepad {
    public static void main(String[] args) {
        ArrayList<String> ans=pad("","12");
        System.out.println(ans);
        System.out.println(padCount("","12"));
    }
    static ArrayList<String> pad(String p,String up){
        if (up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list=new ArrayList<>();

        int digit=up.charAt(0);
        for(int i=(digit-1) * 3;i<digit * 3;i++){
            char ch=(char)('a' + i);
            list.addAll(pad(p+ch,up.substring(1)));
        }
        return list;
    }
    static int padCount(String p,String up){
        if (up.isEmpty()) {

            return 1;

        }

        int count=0;
        int digit=up.charAt(0);
        for(int i=(digit-1) * 3;i<digit * 3;i++){
            char ch=(char)('a' + i);
            count=count+(padCount(p+ch,up.substring(1)));
        }
        return count;
    }
}
