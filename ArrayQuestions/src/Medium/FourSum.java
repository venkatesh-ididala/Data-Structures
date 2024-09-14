package Medium;
import java.util.*;
class Foursum {
        public static void main(String[] args) {
            int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4,5,5};
            int n = arr.length;
            int target=8;

            System.out.println(Sum(arr, n,target));
        }
        public static List<List<Integer>> Sum(int[] arr, int n,int target){
            Arrays.sort(arr);
            List<List<Integer>> ans=new ArrayList<>();
            for(int i=0;i<n;i++) {
                if (i > 0 && arr[i] == arr[i - 1]) {
                    continue;
                }
                for (int j = i + 1; j < n; j++) {
                    if (j != i + 1 && arr[j] == arr[j - 1]) {
                        continue;
                    }
                    int k = j + 1;
                    int l = n - 1;
                    while (k < l) {
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
                        if (sum == target) {
                            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            ans.add(temp);
                            k++;
                            l--;
                            //skip the duplicates:
                            while (k < l && arr[k] == arr[k - 1]) j++;
                            while (k < l && arr[l] == arr[l + 1]) l--;
                        } else if (sum > target) {
                            l--;
                        } else {
                            k++;
                        }

                    }
                }
            }
            return ans;
        }
    }
    /*public static List<List<Integer>> Sum(int[] arr, int n){
        Set<Integer> set=null;
        ArrayList<Integer>  temp=new ArrayList<>();
        ArrayList<Integer> triplet=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            Set<Integer> Hashset=null;

            for(int j=i+1;j<n;j++){
                int third=-(arr[i]+arr[j]);

                if(Hashset.contains(third)){

                    temp.add(arr[i],arr[j],third);
                    sorting(arr);
                    set.add(temp);




                }

                Hashset.add(arr[j]);
            }

        }
        ans.add(set);
    }
*/