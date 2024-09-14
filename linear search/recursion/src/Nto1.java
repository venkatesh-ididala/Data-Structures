public class Nto1 {
    public static void main(String[] args) {
        pri(10);
    }
    static void pri(int n){
        if(n==0){
            return ;
        }
            System.out.println(n);
            pri(n-1);
    }
}
