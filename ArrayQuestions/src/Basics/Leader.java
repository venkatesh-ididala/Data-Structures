package Basics;

import java.util.ArrayList;


public class Leader {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        int n = arr.length;

        System.out.println(findLeader(arr, n));
    }
    public static ArrayList<Integer> findLeader(int[] arr,int n){
        ArrayList<Integer> ans=new ArrayList<>();
        int max=0;
        for(int i=n-1;i>0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
            }
                    max=Math.max(max,arr[i]);
        }
        return ans;
    }
}
