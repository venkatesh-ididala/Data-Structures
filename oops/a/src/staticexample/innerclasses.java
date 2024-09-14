package staticexample;
//outside class(main class can`t be static ....but inner classes can be static
/*class test{
    static String name;
    public test(String name){
        test.name=name;
    }
}
public class innerclasses {


    public static void main(String[] args) {
        test obj1=new test("rahul");
        test obj2=new test("dhoni");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
*/


public class innerclasses {
//the class test is not depended on the instance of the innerclasses ...it is depended on the innerclasses
   static  class test{
         String name;
        public test(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        test obj1=new test("rahul");
        test obj2=new test("dhoni");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
