package Medium;

public class NumberOfsubarrays {
    public static void main(String[] args) {
        int[]  arr={1,2,3,1,1,1,1,2,3,3};
        int n=arr.length;
        int k=3;

        System.out.println(subarrayscount(arr,n,k));
    }
    public static int subarrayscount(int[] arr,int n,int k){
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;

                }
            }
        }
        return count;
    }
}
