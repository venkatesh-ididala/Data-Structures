package Basics;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,4,76,5,356,6};
        int n=arr.length;
        int num=356;
        System.out.println(Search(arr,n,num));
    }
    public static int Search(int[] arr,int n,int num){
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

}
