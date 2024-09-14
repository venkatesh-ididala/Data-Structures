package Basics;

import java.util.Arrays;

public class RotateKPlaces2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9,9};
        int n=arr.length;
        int k=4;
        System.out.println(Arrays.toString(RotateByReversing(arr,n,k)));
    }
    public static int[]  RotateByReversing(int[] arr,int n,int k){

        Reverse(arr,0,k-1);
        Reverse(arr,n-k-1,n-1);
        Reverse(arr,0,n-1);
        return arr;
    }
    public static void Reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }


}
