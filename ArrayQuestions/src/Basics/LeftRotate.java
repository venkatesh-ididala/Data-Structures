package Basics;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr={2,3,7,4,3,2};
        int n=arr.length;
        System.out.println(Arrays.toString(RotateByOnePlace(arr, n)));
    }
    public static int[] RotateByOnePlace(int[] arr, int n){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];

        }
        arr[n-1]=temp;

        return arr;
    }
}
