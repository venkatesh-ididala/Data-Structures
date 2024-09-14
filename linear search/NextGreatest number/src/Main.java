public class Main {
    public static void main(String[] args) {

        char[] l={'c','f','h','m','x'};
        char ch='g';
        char ans=nextGreatestLetter(l,ch);
        System.out.println(ans);

    }
    //ceiling of a number is the smallest number greater than or equal to target
        public static char nextGreatestLetter(char[] letters, char target) {


            int start=0;
            int end=letters.length-1;

            //boolean isAsc=arr[start]<arr[end]
            while(start<= end){
                int mid=start+(end-start)/2 ;   //--->sometimes it exceeds the integer range so better to use start+(end-start)/2;


                if(target<letters[mid]){

                    end=mid-1;

                }
                else{
                    start=mid+1;

                }



            }
            return letters[start % letters.length];
        }
}
