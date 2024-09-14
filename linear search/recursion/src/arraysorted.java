public class arraysorted {
    public static void main(String[] args) {
        int[] arr={1,3,9,6,8,9};
        boolean ans=isSorted(arr,0);
        System.out.println(ans);
    }
    static boolean isSorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr,index+1);
    }

}
