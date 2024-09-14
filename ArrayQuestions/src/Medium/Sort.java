package Medium;


import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,1,2,1};
        int n=arr.length;

        System.out.println(Arrays.toString(SortArray(arr,n)));

    }
    public static int[] SortArray(int[] arr,int n){
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high) {
            if (arr[mid] == 0) {
                swap(arr, low,mid);
                low++;
                mid++;


            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else{
                swap(arr, mid, high);
                mid++;
                high--;
            }


        }
        return arr;
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
