public class Main {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = Evennumber(nums);
        System.out.println(ans);
        System.out.println(Digits2(12933));
    }

    static int Evennumber(int[] arr) {
        int count = 0;
        for (int i:arr ) {

            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int ele) {
        int NumberofDigits = Digits(ele);

        return NumberofDigits % 2 == 0;
    }


    static int Digits(int num) {
        if (num < 0) {
            num = num * -1;

        }
        return (int)(Math.log10(num))+1;
    }
   /* static int Digits(int num) {
        if(num<0){
            num=num*-1;

        }
        if(num==0){
            return 1;
        }
        int c=0;
        while(num>0){
            c++;
            num/=10;
        }
        //return (int)(Math.log10(num))+1  ----> another way to find the number of digits

        return c;



    }*/

}