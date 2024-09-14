public class RotatedsortedArray {
    public static void main(String[] args) {
        int[] nums={24,45,67,98,2,4,16};
        int target=4;
        int ans=RBS(nums,target);
        System.out.println(ans);

    }

    static int RBS(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return BinarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (arr[0] < target) {
            return BinarySearch(arr, target, 0, pivot);
        } else {
            return BinarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (mid<end && arr[mid] > arr[mid + 1]) {
                return mid;

            }
            if (start<mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] < arr[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
            //if start ,mid and end are same then duplicates is removed
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                //what if the start and end elements is pivot then
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
        }
        return -1;
    }

    static int BinarySearch(int[] arr, int target,int start,int end) {

        //if target is greater than greatest number in the array



        //boolean isAsc=arr[start]<arr[end]
        while (start <= end) {
            int mid = start + (end - start) / 2;   //--->sometimes it exceeds the integer range so better to use start+(end-start)/2;

            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {

                end = mid - 1;

            } else {
                return mid;
            }
        }
        return -1;
    }

}
