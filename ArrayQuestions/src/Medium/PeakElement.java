package Medium;

    public class PeakElement {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 8, 2, 1};
            int n = arr.length;
            System.out.println(findPeak(arr,n));
        }
        public static int findPeak(int[] arr, int n) {
            int low = 0;
            int high = n - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                // Ensure we don't access out of bounds
                if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                    return mid;
                }
                else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            return -1;
        }

    }
