public class findMountainArray {
    public static void main(String[] args){
        int[] arr={1,5,7,8,3,2,1};
        int key=3;
        int ans=search(arr,key);
        System.out.println(ans);


    }
    static int search(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstArr=OrderAgnosticBS(arr,target,0,peak);
        if(firstArr !=-1){
            return firstArr;
        }
        return OrderAgnosticBS(arr,target,peak+1,arr.length-1);
    }


    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //it is descending order array
                //ans may be the mid value but look at the left side
                end = mid;
            } else {
                //asc order array
                start = mid + 1;
            }
            //start == end --->pointing the largest element in the array
            return start;
        }
        return -1;

    }
    static int OrderAgnosticBS(int[] arr,int target,int start,int end){

        boolean isAsc=arr[start]<arr[end];
        while(start<= end){
            int mid=start+(end-start)/2 ;
            //--->sometimes it exceeds the integer range so better to use start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }

        }

        return -1;
    }
}
