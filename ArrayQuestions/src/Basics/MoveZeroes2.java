package Basics;

import java.util.Arrays;

import static java.util.Collections.swap;

public class MoveZeroes2 {
    public static void main(String[] args) {
        int[] arr={24,67,8,3,78,3,7,0,0,7,0,7,969,0,4};
        int n=arr.length;
        System.out.println(Arrays.toString(MoveZeroesEnd(arr,n)));
    }
    public static int[] MoveZeroesEnd(int[] arr,int n){
        //swapping the non-zero and zero

        int j=-1;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;

            }
        }
        if(j==-1) return arr;
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                swap(arr,arr[i],arr[j]);
                j++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp=i;
        i=i1;
        i1=temp;
    }


}
