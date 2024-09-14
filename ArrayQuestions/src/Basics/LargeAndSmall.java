package Basics;

import java.util.Arrays;

public class LargeAndSmall {
    private static final int INT_MAX =9999 ;

    public static void main(String[] args) {
        int[] arr={5,6,8,9,4,2};
        int n=arr.length;

       // for(int i=0 ;i<n;i++){
            // arr[i]=sc.nextInt();
        //}
        System.out.println(Arrays.toString(getSecondLargestAndSmallest(arr,n)));
    }
   public static int SecondLargest(int[] arr,int n){
        int largest=arr[0];
        int secondlargest=-1;

        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && secondlargest<arr[i]){
                secondlargest=arr[i];
            }

        }
        return secondlargest;


   }
    public static int SecondSmallest(int[] arr,int n){
        int smallest=arr[0];
        int secondsmallest=INT_MAX;

        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                secondsmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]>smallest && secondsmallest>arr[i]){
                secondsmallest=arr[i];
            }

        }
        return secondsmallest;


    }


    public static  int[] getSecondLargestAndSmallest(int[] arr,int n){
        int secondLargest=SecondLargest(arr,n);
        int secondSmallest=SecondSmallest(arr,n);

        return new int[]{secondLargest,secondSmallest};

    }
}
