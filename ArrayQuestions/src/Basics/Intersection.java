package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[] a1={1,3,4,6,7,8};
        int[] a2={1,2,3,4};

        int n1=a1.length;
        int n2=a2.length;
        System.out.println(intersectionOfSortedArrays(a1,a2,n1,n2));
    }
    public static ArrayList<Integer> intersectionOfSortedArrays(int[] arr1,int[] arr2,int n1,int n2){

        int[] vis={0};
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){

                if(arr1[i]==arr2[j] && vis[j]==0){
                    ans.add(arr1[i]);
                    vis[j]=1;
                    break;
                }
                if(arr2[j]>arr1[i]) break;
            }
        }
        return ans;
    }


}
