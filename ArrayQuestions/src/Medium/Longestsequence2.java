package Medium;

import java.util.HashSet;
import java.util.Set;

public class Longestsequence2 {

    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,5,6,88,100,101,102,109};
        int n=arr.length;
        System.out.println(sequence(arr,n));
    }
    public static int sequence(int[] arr,int n){
        int count=0;
        int longest=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int it:set) {
            //check if it is a starting number or not
            if (!set.contains(it-1)){
                count=1;
                int x=it;
                while(set.contains(x+1)){
                    x=x+1;
                    count=count+1;
                }
                longest=Math.max(longest,count);


            }
        }
        return longest;
    }
}
