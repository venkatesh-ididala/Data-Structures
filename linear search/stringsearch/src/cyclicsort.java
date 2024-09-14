import java.util.*;
public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        int n=arr.length;
        while (i <= n-1) {

            int crct = arr[i] - 1;
            if (arr[i] != arr[crct]) {
                swap(arr, i, crct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}

