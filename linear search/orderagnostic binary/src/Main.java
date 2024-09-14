public class Main {
    public static void main(String[] args) {
        int[] nums={90,23,4,5,67,3,-2,-9};
        int key=3;
        int ans=Binarysearch(nums,key);
        System.out.println(ans);

    }
    static int Binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start<= end) {

            int mid = (start + end) / 2;
            //--->sometimes it exceeds the integer range so better to use start+(end-start)/2;
            if (target == mid) {
                return arr[mid];
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else if (target > arr[mid]) {

                    start = mid + 1;

                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;

                } else if (target > arr[mid]) {

                    end = mid - 1;

                }
            }

        }
        return -1;
    }
}