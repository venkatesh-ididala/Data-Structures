package Basics;

public class Subarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,2,3,3};
        int n=arr.length;
        int k=6;

        System.out.println(SubarrayWithSumK(arr,n,k));

    }
    public static int SubarrayWithSumK(int[] arr,int n,int k){
        int left=0;
        int right=0;
        int sum=0;
        int maxLen=0;

        while(sum>k && left<=right){
            sum=sum-arr[left];
            left++;

        }
        if(sum==k){
            maxLen=Math.max(maxLen,right-left+1);
        }
        right++;

        if(right<n){
            sum+=arr[right];

        }
       return maxLen;

    }
}
