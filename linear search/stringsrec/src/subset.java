import java.util.*;
public class subset {
    public static void main(String[] args) {
        int[] arr={4,3,5};
        List<List<Integer>> ans=sub(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }

    }
    static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }
        return  outer;
    }
}
