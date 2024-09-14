import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,56,7},{4,6,8,9,9}};
        int key=8;
        int[] ans=Search(arr,key);
        System.out.println(Arrays.toString(ans));

    }
    static int[] Search(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int x=0;x<arr.length;x++){
            for(int y=0;y<arr[x].length;y++){
                if(arr[x][y]==target){
                    return new int[]{x,y};
                }
            }
        }
        return new int[]{-1,-1};
    }

}