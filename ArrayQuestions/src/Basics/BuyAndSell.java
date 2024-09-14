package Basics;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int n=arr.length;

        System.out.println(StockProfit(arr,n));
    }
    public static int StockProfit(int[] arr,int n){
        int min=arr[0];
        int profit=0;
        for(int i=1;i<n;i++){
            int cost=arr[i]-min;


          profit=Math.max(cost,profit);
            min=Math.min(min,arr[i]);

        }
        return profit;
    }
}
