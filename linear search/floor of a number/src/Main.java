public class Main {
    public static void main(String[] args) {

        int[] nums={-23,-20,-4,-1,0,5,46,78,65,90};
        int key=65;
        int ans=floor(nums,key);
        System.out.println(ans);

    }
    //floor of a number is the greatest number less than or equal to target
    static int floor(int[] arr,int target){
        //if target is the least number in the array return -1

        int start=0;
        int end=arr.length-1;

        //boolean isAsc=arr[start]<arr[end]
        while(start<= end){
            int mid=start+(end-start)/2 ;   //--->sometimes it exceeds the integer range so better to use start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;

            }
            else if(target<arr[mid]){

                end=mid-1;

            }
            else{
                return mid;
            }

        }
        return arr[end];
    }

}
