package Basics;

import java.util.ArrayList;

public class Intersection2 {
        public static void main(String[] args) {
            int[] a1={1,3,4,6,7,8};
            int[] a2={1,2,3,4};

            int n1=a1.length;
            int n2=a2.length;
            System.out.println(intersectionOfSortedArrays(a1,a2,n1,n2));
        }
        public static ArrayList<Integer> intersectionOfSortedArrays(int[] arr1, int[] arr2, int n1, int n2) {

            int i = 0;
            int j = 0;
            ArrayList<Integer> ans = new ArrayList<>();
            while(i<n1 && j<n2) {
                if (arr1[i] < arr2[j]) {
                    i++;
                } else if (arr2[j] < arr1[i]) {
                    j++;
                } else {
                    ans.add(arr1[i]);
                    i++;
                    j++;
                }
            }
            return ans;
        }

}
