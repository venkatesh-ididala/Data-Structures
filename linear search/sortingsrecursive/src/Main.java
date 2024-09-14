import java.util.Arrays;

import java.util.*;
public class Main {
    public static void main(String[] args) {
    //triangle(4,0);
        int[] arr={2,5,8,4,3};
        //bubblesort(arr,arr.length-1,0);
        selectionsort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr,int r,int c,int max){
        if(r==0){
            return ;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selectionsort(arr,r,c+1,c);
            }
            else{
                selectionsort(arr,r,c+1,max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selectionsort(arr,r-1,0,0);
        }
    }


    /*static void bubblesort(int[] arr,int r,int c){
        if(r==0){
            return ;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubblesort(arr,r,c+1);
        }
        else{
            bubblesort(arr,r-1,0);
        }

    }
   static void triangle(int r,int c){
         if(r==0){
             return;
         }

         if(c<r){

             triangle(r,c+1);
             System.out.println("*");
         }
         else{
             triangle(r-1,c);
             System.out.println();
         }
    }*/
}