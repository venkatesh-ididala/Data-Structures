import java.util.*;
public class duplicateSubseq {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=sub(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }

    }
    static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++) {
            //if current and previous element is same then s=e+1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;


                int n = outer.size();
                for (int j = start; j < n; j++) {
                    ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);

                }

        }
        return  outer;
    }
}

