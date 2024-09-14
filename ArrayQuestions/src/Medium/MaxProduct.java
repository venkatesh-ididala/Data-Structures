package Medium;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr={2,3,-2,0,5,2,-2,0,9,3,1,0,4,1};
        int n=arr.length;


        System.out.println(Product(arr,n));
    }
    public static int Product(int[] arr,int n){
        int pre=1;
        int suf=1;
        int Max=0;
        for(int i=0;i<n;i++){
            pre=pre*arr[i];
            suf=suf*arr[n-i-1];

            if(pre ==0 ) pre=1;
            if(suf==0) suf=1;

            Max=Math.max(Max,Math.max(pre,suf));
        }
        return Max;
    }
}
