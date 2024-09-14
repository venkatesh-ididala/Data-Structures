import java.lang.String;
public class Main {
    public static void main(String[] args) {
        String name="virat kohli";
        char key='h';
        System.out.println(search(name,key));


    }
    static boolean search(String str,char target){

        if(str.isEmpty()){
            return false;
        }
       /* for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)) {
                return true;
            }
        }*/
        for(char ch:str.toCharArray())
        {
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}

//search the elements within the range as ---> (arr,target,start,end)