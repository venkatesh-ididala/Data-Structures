public class linearsearch {
    public static void main(String[] args) {
        int[] arr={2,6,79,9,622,4,90};
        int key=34;
        boolean ans =find(arr,key,0);
        System.out.println(ans);
    }
    static boolean find(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
}
