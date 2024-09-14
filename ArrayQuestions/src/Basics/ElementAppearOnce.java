package Basics;

public class ElementAppearOnce {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4};
        int n=arr.length;

        System.out.println(ElementOnce(arr,n));
    }
    public static int ElementOnce(int[] arr,int n){
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^(arr[i]);
        }
        return xor;
    }
}
