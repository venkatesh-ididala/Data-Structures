package Basics;

import java.util.Arrays;

import static Medium.Sort.swap;


public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={1,3,2};
        int n=arr.length;

        System.out.println(Arrays.toString(Permutation(arr,n)));
    }
    public static int[] Permutation(int[] arr,int n){
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }


        }
        if(index==-1){
            reverse(arr,0,n-1);
            return arr;
        }
        for(int i=n-1;i>index;i--){
            if(arr[index]<arr[i]){
                swap(arr,i,index);
                break;
            }
        }


        reverse(arr,index+1,n-1);
        return arr;
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
