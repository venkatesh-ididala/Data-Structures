import java.util.Arrays;

public class peakElement2 {
    public static void main(String[] args) {
        int[][] arr={{1,3,4,5,6,7},{2,6,7,9,0,2},{2,5,6,8,6,2},{3,1,6,6,1,5}};
        int n=arr.length;
        int m=arr[0].length;

        System.out.println(Arrays.toString(findPeakElement(arr,n,m)));
    }
    public static int findMax(int[][] arr,int n,int mid){
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<n;i++){
            max=Math.max(arr[i][mid],max);
                index=i;
        }
        return index;
    }
    public static int[] findPeakElement(int[][] arr,int n,int m){
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=findMax(arr,n,mid);
            if((mid==0 || arr[row][mid-1] <=arr[row][mid]) && (arr[row][mid]>=arr[row][mid+1]|| mid==m-1)){
                return new int[]{row,mid};
            }
            else if(mid<m-1 || arr[row][mid]<arr[row][mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

}
