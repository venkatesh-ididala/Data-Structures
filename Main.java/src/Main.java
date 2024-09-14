public class Main {
    static int x = 10;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 100; //shadowed the higher level scope variable
        System.out.println(x);

    }
}
