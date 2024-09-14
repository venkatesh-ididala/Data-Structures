package Medium;

import java.util.Arrays;

public class MissAndRepeat {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,6,1};
        int n=arr.length;

        System.out.println(Arrays.toString(Find(arr,n)));
    }
    public static int[] Find(int[] arr,int n){
        //sum= S
        //Square sum=sn
        int S=(n*(n+1))/2;
        int SN=(n*(n+1)*(2*n+1))/6;
        int s=0;
        int sn=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
            sn+=arr[i]*arr[i];
        }
        int val1=s-S; //x-y
        int val2=sn-SN; //(x+y)(x-y)
        val2=val2/val1;
        int x=(val1+val2)/2;  //repeating value
        int y=x-val1; //missing value


        return new int[]{x,y};
    }
}
