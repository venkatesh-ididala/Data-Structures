public class Main {
    public static void main(String[] args) {

        int start = 0;
        int end = arr.length - 1;

//boolean isAsc=arr[start]<arr[end]
        while (start <= end) {
            int mid = start + (end - start) / 2;   //--->sometimes it exceeds the integer range so better to use start+(end-start)/2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;

            } else if (arr[mid] < arr[mid + 1]) {

                start = mid + 1;

            } else {
                return mid;
            }

        }
        return -1;
    }               }