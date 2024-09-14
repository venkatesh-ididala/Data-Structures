package Basics;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,0,1,1};
        int n=arr.length;

        System.out.println(MaxOnes(arr,n));
    }
    public static int MaxOnes(int[] arr,int n){
        int count=0;
        int maxi=0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                maxi=Math.max(count,maxi);
            }
            else{
                count=0;
            }
        }
        return maxi;

    }
}
