package Basics;

import java.util.Arrays;

public class RotateKPlaces {
    public static void main(String[] args) {
        int[] arr={3,4,7,8,9,43,2,1};
        int n=arr.length;
        int k=3;
        System.out.println(Arrays.toString(RotateArray(arr,n,k)));
    }
    public static int[] RotateArray(int[] arr,int n,int k){
        k=k%n;

        int[] temp=new int[k];
        //elements rotation
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        //shifting the remaining elements
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        //put back temp array
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }
return arr;
    }
}
