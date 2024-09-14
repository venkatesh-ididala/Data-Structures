package staticexample;

public class staticBlock {
    static int a=5;
    static int b;

    //will run only once when the first obj is created,when the class is loaded for the first time
    static{
        System.out.println("it is a static block");
        b=a*6;
    }

    public static void main(String[] args) {
        System.out.println(staticBlock.a+" "+staticBlock.b);

        staticBlock.b+=3;
        System.out.println(staticBlock.a + " "+staticBlock.b);
    }
}
