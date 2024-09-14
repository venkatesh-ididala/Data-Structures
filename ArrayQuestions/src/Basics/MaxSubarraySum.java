package Basics;

import java.util.Arrays;

public class MaxSubarraySum {
    private static final int INT_MIN = 0 ;

    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;

        System.out.println(Arrays.toString(MaxSum(arr,n)));
    }

    //optimal approach
    public static int[] MaxSum(int[] arr,int n){
        int sum=0;int Max_sum=INT_MIN;
        int start=0;
        int ansStart=-1;
        int ansEnd=-1;
        for(int i=0;i<n;i++){
            if(sum==0) start=i;
            sum+=arr[i];



            if(sum<0){
                sum=0;
            }

            if(sum>Max_sum){
                Max_sum=sum;
                ansStart=start;
                ansEnd=i;

            }
        }
        return new int[]{ansStart,ansEnd};
    }


    //better approach

    /*public static int MaxSum(int[] arr,int n){
        int sum=0;
        int Max_sum=INT_MIN;

        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                Max_sum=Math.max(sum,Max_sum);

            }
        }
        return Max_sum;
    }
*/




    //brute force approach
  /*  public static int MaxSum(int[] arr,int n){
        int sum=0;int Max_sum=INT_MIN;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                    sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    Max_sum=Math.max(sum,Max_sum);


                }

            }

        }
        return Max_sum;
    }*/
}
