package Medium;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,6};
        int n=arr.length;

        //Moore's voting algorithm
        System.out.println(Element(arr,n));
    }
    public static int Element(int[] arr,int n){
        int count=0;
        int el = -1;

        for(int i=0;i<n;i++){
            if(count==0) {
                count=1;
                el= arr[i];
            } else if(el==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(el==arr[i]){
                count1++;
            }
            if(count1>n/2){
                return el;
            }
        }
        return -1;
    }
}
