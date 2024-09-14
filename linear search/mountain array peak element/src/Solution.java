class Missing {
    public static void main(String[] args) {
        int[] arr={1,0,3};
        int ans=missingNumber(arr);
        System.out.println(ans);
    }
    static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int crct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[crct]){
                swap(nums,i,crct);
            }
            else{
                i++;
            }

        }
        //missing number
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;


    }

    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}