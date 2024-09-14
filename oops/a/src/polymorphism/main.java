package polymorphism;

public class main {
    public static void main(String[] args) {
        shapes shape=new shapes();
        circle c=new circle();
        c.area();
        shape.area();

        shapes s=new square();
        s.greeting();   //-----> overriding of the static method not done for the child class...it runs only parent method .

        //you can inherit but can't override

    }
}
