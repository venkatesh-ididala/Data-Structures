public class Main {
    public static void main(String[] args) {
        int[] nums={1,3,4,5,6,8,8,18,43,56,73,78,83,97};
        int number=83;
        int ans=InfiniteArray(nums,number);
        System.out.println(ans);

    }
    //bottom up approach of binary search ---> 2*n

    static int InfiniteArray(int[] arr,int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return BinarySearch(arr,target,start,end);
    }

    static int BinarySearch(int[] arr,int target,int start,int end){

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
        return -1;
    }
}