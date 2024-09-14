package Medium;

import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int n=arr.length;
        int  target=14;

        System.out.println(Arrays.toString(FindSum(arr,n,target)));
    }
    public static int[] FindSum(int[] arr,int n,int target){
        sorting(arr);
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];

            if(sum==target){
                return new int[]{left,right};
            }
            else if(sum<target) left++;
            else right--;
        }
        return new int[]{-1,-1};   //----> true/false
    }
    static void sorting(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            //for the i th pass iterations
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;

                }

            }
            if(!swapped){
                break;
            }
        }
    }
}
