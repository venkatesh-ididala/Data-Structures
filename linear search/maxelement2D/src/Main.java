import java.util.Arrays;

public class Main {


        public static void main(String[] args) {
            int[][] arr={{1,2,3},{4,56,7},{4,6,8,9,9}};
            int max=Integer.MIN_VALUE;
            int ans=Max(arr,max);
            System.out.println(ans);

        }
        static int  Max(int[][] arr,int Max){
            if(arr.length==0){
                return -1;
            }
            for(int[] ints:arr){
                for(int element:ints)
                {
                    if(element>Max){
                        Max=element;
                    }
                }
            }
            return Max;

    }
}