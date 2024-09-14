import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        fun(2,3,4,6,67,8,4,3);

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}