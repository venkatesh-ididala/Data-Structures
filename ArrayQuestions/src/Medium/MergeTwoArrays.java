package Medium;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={0,2,6,7,8,9};

        int  n=arr1.length;
        int m=arr2.length;

        MergeSortedArrays(arr1,arr2,n,m);

    }
    // sort it in arr3 and modify in arr1 and arr2
    //left =n-1 and right=0 and then swap those and then sort

    public static void MergeSortedArrays(int[] arr1,int[] arr2,int n,int m){
        int len=(n+m);
        int gap=(len/2)+(len%2);
        int left=0;
        int right=left+gap;
        while(gap>0){
            while(right<len){
                //arr1 and arr2
                if(left<n && right>=n){
                    swap(arr1,arr2,left,right-n);
                }
                else if(left>=n ){
                    swap(arr2,arr2,left-n,right-n);
                }
                else{
                    swap(arr1,arr1,left,right);
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap=(gap/2)+(gap%2);


        }

    }
    public static void swap(int[] arr1,int[] arr2,int ind1,int ind2){
        if(arr1[ind1]>arr2[ind2]){
            int temp=arr1[ind1];
            arr1[ind1]=arr2[ind2];
            arr2[ind2]=temp;
        }
    }

}
