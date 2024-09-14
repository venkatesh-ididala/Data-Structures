public class Main {
    public static void main(String[] args)
    {
        skip("","bacchadjack");
        System.out.println(skipappnotApple("shspapplhdh"));
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
            //return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
            //skip(up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
            //return ch+skip(up.substring(1));  --->everytime new object is created and ans is appended.
        }

    }
    static String skipappnotApple(String s){
        if(s.isEmpty()){
            return " ";

        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipappnotApple(s.substring(3));
        }
        return  s.charAt(0)+ skipappnotApple(s.substring(1));
    }
}