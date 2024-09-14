import java.util.*;
public class Allnumbers {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,7,8};
        System.out.println(findDisappearedNumbers(arr));
    }
        static List<Integer> findDisappearedNumbers(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int crct = nums[i]-1;
                if (nums[i] < nums.length && nums[i] != nums[crct]) {
                    swap(nums, i, crct);
                } else {
                    i++;
                }

            }
            //finding all missing numbers
            List<Integer> ans=new ArrayList<>();
            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    ans.add(index+1);
                }
            }
            return ans;
        }


    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }

}
