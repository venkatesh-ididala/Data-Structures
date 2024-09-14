package Basics;

import java.util.Arrays;

public class RearrangeSign {
    public static void main(String[] args) {
        int[] arr={-1,3,6,-3,-5,6};
        int n=arr.length;

        System.out.println(Arrays.toString(ArrayBySigns(arr,n)));
    }
    public static int[] ArrayBySigns(int[] arr,int n){
        int posIndex=0;int negIndex=1;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[negIndex]=arr[i];
                negIndex+=2;
            }
            else{
                ans[posIndex]=arr[i];
                posIndex+=2;
            }
        }
        return ans;
    }
}
