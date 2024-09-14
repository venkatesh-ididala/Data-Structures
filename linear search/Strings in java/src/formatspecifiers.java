import java.net.SocketOption;
import java.util.*;
public class formatspecifiers
{
    public static void main(String[] args) {
       /* %c --> character
                %d--> decimal
                %f---> float
                %o --->octal
                %i -->integer (base 10 integer)
                %s--> string
                %e ---> exponential floating point
                %c---->character
                %x---->hexa decimal number
                %t -->date/time
                %u --->unsigned decimal
                %n --->new line*/

                //operators
        System.out.println('a'+'c');  //concatenation
        System.out.println("a"+"b");
        System.out.println("a"+'c'); //high priority conversion
        System.out.println((char)('a'+8)); //type casting
        System.out.println("a"+1);
        //---> integer converted into Integer(wrapper class) then call toString so that 1 is converted into "1";

       // System.out.println(new ArrayList<>()+""+new Integer(56));
        //at least one of the object is string type

        String str="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            str=str+ch;
        }
        System.out.println(str);




    }
}
