public class palindrome {
    public static void main(String[] args) {
        String s="t";
        System.out.println(isPalin(s));
    }
    static boolean isPalin(String str){
        if(str.length()==0){
            return true;

        }
       str= str.toLowerCase();
       for(int i=0;i<str.length()/2;i++){
           char start=str.charAt(i);
           char end=str.charAt(str.length()-1-i);
           if(start!=end){
               return false;
           }

       }
       return true;

    }
}
