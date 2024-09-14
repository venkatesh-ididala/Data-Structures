package Medium;

public class Longestsequence {
    private static final int INT_MIN = 9999;

    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        int n = arr.length;


        System.out.println(ConsecutiveSequence(arr, n));
    }

    public static int ConsecutiveSequence(int[] arr, int n) {
        sorting(arr);
        int longest = 0;
        int count = 0;
        int left_smaller = INT_MIN;

        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == left_smaller) {
                count += 1;
                left_smaller = arr[i];
            } else if (left_smaller != arr[i]) {
                count = 1;
                left_smaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
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
