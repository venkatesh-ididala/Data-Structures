public class Main {
    public static void main(String[] args) {

        int ans=fibonumber(50);
        System.out.println(ans);
    }
    static int fibonumber(int n){
       return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
       //formula to get the fibonacci
    }
    static int  fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}