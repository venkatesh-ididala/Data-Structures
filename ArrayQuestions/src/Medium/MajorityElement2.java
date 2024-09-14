package Medium;

import java.util.ArrayList;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,3,3,4};
        int n=arr.length;

        System.out.println(MajorOne(arr,n));
    }
    public static ArrayList<Integer>  MajorOne(int[] arr,int n){
        int ele1=0;
        int ele2=0;
        int count1=0,count2=0;
        for(int i=0;i<n;i++){
           if(count1==0 && arr[i]!=ele2){
               count1=1;
               ele1=arr[i];
           }
           else if(count2==0 && arr[i]!=ele1){
               count2=1;
               ele2=arr[i];
           }
           else if(ele1==arr[i] ){
               count1++;
           }
           else if(ele2==arr[i] ){
               count2++;
           }
           else{
               count1--;
               count2--;
           }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(ele1==arr[i]){
                count1++;
            }
            if(ele2==arr[i]){
                count2++;
            }
        }
        int mini=n/3+1;
        if(mini>=count1){
            ans.add(ele1);
        }
        if(mini>=count2){
            ans.add(ele2);
        }
        return ans;

    }
}
