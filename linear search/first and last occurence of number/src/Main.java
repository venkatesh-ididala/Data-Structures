import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr={3,6,8,4,7,7,9,0,4,7,8};
        int n=8;
        int[] ind=searchRange(arr,n);
        System.out.println(Arrays.toString(ind));

    }
    public static int[] searchRange(int[] nums,int target){

        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;

        return ans;
    }
    //this function returns the index
   public static int search(int[] nums,int target,boolean findStartIndex){
        int start=0;
        int end=nums.length-1;
        int ans=-1;

        //boolean isAsc=arr[start]<arr[end]
        while(start<= end){
            int mid=start+(end-start)/2 ;   //--->sometimes it exceeds the integer range so better to use start+(end-start)/2;

            if(target>nums[mid]){
                start=mid+1;

            }
            else if(target<nums[mid]) {

                end = mid - 1;

            }
            else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
    }


}
       return ans;


    }
}