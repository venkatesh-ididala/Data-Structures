package Medium;

import java.util.ArrayList;

public class specialsum {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        int n=arr.size();

        System.out.println(specialSum(arr,n));
    }
        public static int specialSum(ArrayList<Integer> arr, int n) {
            int fsum=0;int left=0;int right=n-1;
            int lsum=0;
            int spcsum=0;
            int spsum=Integer.MAX_VALUE;

            while(left<n && right>=0){
                fsum+=arr.get(left);
                lsum+=arr.get(right);
                left++;
                right--;
                spcsum=(fsum+lsum);
                spsum=Math.min(spcsum,spsum);
            }
            return spsum;
        }
    }
