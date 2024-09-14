import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] acc={{ 1,2,3},{3,2,1},{2,5,6}}

        System.out.println(maxWealth(acc));


    }
    static int  maxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] person :accounts) {
            int rowsum = 0;
            for (int account :person) {

                rowsum += account;

            }

            if (rowsum > max) {
                max = rowsum;
            }
        }
        return (max);

    }

}