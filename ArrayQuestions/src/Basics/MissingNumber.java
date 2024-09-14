package Basics;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int N=5;
        System.out.println(Missing(arr,N));
    }
    public static int  Missing(int[] arr,int N){
        //xor operation for the optimal solution

        int xor1=0;int xor2=0;
        int n=N-1;
        for(int i=0;i<n;i++){
            //contains element of array
            xor2=xor2^(arr[i]);
            //contains natural numbers
            xor1=xor1^(i+1);
        }
        xor1=xor1^N;
        return xor1^xor2;
    }

}
