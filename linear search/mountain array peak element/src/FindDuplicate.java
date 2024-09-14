public class FindDuplicate {
    public static void main(String[] args) {

    }
    static int findDuplicate(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i <= n - 1) {
        if(arr[i]!=i+1) {
            int crct = arr[i] - 1;
            if (arr[i] != arr[crct]) {
                swap(arr, i, crct);
            }
            else{
                return arr[i];
            }
        }else{
            i++;
        }
        }
        //find duplicate number

    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
