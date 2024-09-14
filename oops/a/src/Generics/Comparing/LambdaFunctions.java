package Generics.Comparing;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);

        }
        arr.forEach((item) -> {
            System.out.println(item * 2);
        });

        Operation sum = (a, b) -> a + b;
        Operation product = (a, b) -> a * b;
        Operation subtract = (a, b) -> a - b;

        LambdaFunctions l = new LambdaFunctions();
        System.out.println(l.operate(3, 11, product));
    }


        public int operate(int a,int b,Operation op){
             return op.operation(a,b);

        }

}
interface Operation{
    int operation(int a,int b);
}