package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static Medium.Twosum.sorting;

public class Threesum {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 1, 2, -1, -4};
        int n = arr.length;

        System.out.println(Sum(arr, n));
    }
    public static List<List<Integer>> Sum(int[] arr,int n){
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
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