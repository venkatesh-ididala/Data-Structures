import java.util.*;
public class FindAllDuplicates {
    public static void main(String[] args) {

    }
    static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int crct = arr[i] - 1;
            if (arr[i] != arr[crct]) {
                swap(arr, i, crct);
            } else {
                i++;

            }
        }
        ArrayList<Integer> ans=new ArrayList<>();

        //duplicates
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }


}
