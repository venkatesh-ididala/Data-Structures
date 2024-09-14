public class Main {
    public static void main(String[] args) {
        int[] num ={2,4,7,3,7,3,8,5,78,57};
        int key=112;
        int ans=linearSearch(num,key);
        System.out.println(ans);


    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target)
                return index;


        }
        //if none of the return statements have executed this line will execute
        return -1;
    }
}