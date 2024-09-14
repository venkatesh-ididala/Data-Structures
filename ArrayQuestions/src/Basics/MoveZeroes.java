package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr={3,5,3,6,8,8,9,0,5,7,9,6,0,0,5,8};
        int n=arr.length;

        System.out.println(Arrays.toString(ZeroesToEnd(arr,n)));
    }
    public static int[] ZeroesToEnd(int[] arr,int n){
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        for(int i=0;i<temp.size();i++){
            arr[i]= temp.get(i);
        }
        int newStart=temp.size();

        for(int i=newStart;i<n;i++){
            arr[i]=0;
        }

return arr;
    }
}
