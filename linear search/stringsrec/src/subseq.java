import java.util.*;
public class subseq {
    public static void main(String[] args) {
    System.out.println(sub("","abc"));
        System.out.println(subAscii("","abc"));

    }
    static ArrayList<String> sub(String p,String up){
    //static void sub(String p,String up){


        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);

            return list ;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=sub(p+ch,up.substring(1));
        ArrayList<String> right=sub(p,up.substring(1));

        left.addAll(right);
        return left;
    }
    static ArrayList<String> subAscii(String p,String up){
        //static void sub(String p,String up){


        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);

            return list ;
        }
        char ch=up.charAt(0);
        ArrayList<String> first=sub(p+ch,up.substring(1));
        ArrayList<String> second=sub(p,up.substring(1));
        ArrayList<String> third=sub(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }

}
