public class Main {
    public static void main(String[] args) {

        int[] nums={-23,-20,-4,-1,0,5,46,78,65,90};
        int key=45;
        int ans=ceiling(nums,key);
        System.out.println(ans);

    }
    //ceiling of a number is the smallest number greater than or equal to target
    static int ceiling(int[] arr,int target){

        //if target is greater than greatest number in the array
        if(target>arr[arr.length-1]){
            return -1;
        }
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
        return arr[start];
    }

}
