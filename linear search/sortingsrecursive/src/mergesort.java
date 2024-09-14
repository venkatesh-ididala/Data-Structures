import java.util.*;
public class mergesort {
    public static void main(String[] args) {
    int[] arr={32,56,768,2,26};
    arr=merge(arr);
    System.out.println(Arrays.toString(arr));

    }
    static int[] merge(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=merge(Arrays.copyOfRange(arr,0,mid));
        int[]  right=merge(Arrays.copyOfRange(arr,mid,arr.length));

        return merge1(left,right);
    }
    static int[] merge1(int[] first,int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                    mix[k]=second[j];
                    j++;
            }
            k++;
        }
        //if elements remained outside the loop
        while(i<first.length)
        {
            mix[k]=first[i];
            k++;
            i++;
        }
        while(j<second.length)
        {
            mix[k]=second[j];
            k++;
            j++;
        }
        return mix;
    }
}
