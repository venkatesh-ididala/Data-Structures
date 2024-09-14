public class MisMatch {
    public static void main(String[] args) {

    }
    static int[] missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int crct=nums[i]-1;
            if(nums[i]!=nums[crct]){
                swap(nums,i,crct);
            }
            else{
                i++;
            }

        }
        // the array with duplicate and missing number
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[]{nums[index],index+1};
            }
        }
        return new int[]{-1,-1};


    }

    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
