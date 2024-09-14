class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 9, 11, 5, 3, 1};
        int ans = peakIndexInMountainArray(nums);
        System.out.println(ans);
    }


    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //it is descending order array
                //ans may be the mid value but look at the left side
                end = mid;
            } else {
                //asc order array
                start = mid + 1;
            }
            //start == end --->pointing the largest element in the array
            return arr[start];
        }
        return -1;

    }
}