public class Main {
    public static void main(String[] args)
    {
        String a="chinnu";
        String b="chinnu";

        System.out.println(a==b);
        //comparator checks the values in the pool

        /* String c=new String("virat");
        String d=new String("virat");
        //creates the different objects for the reference variable in the heap
        System.out.println(c==d);*/
        String c=new String("virat");
        String d=new String("virat");
        //creates the different objects for the reference variable in the heap
        System.out.println(c.equals(d)); //---> it checks the values only

        //Wrapper classes method
        Integer in=new Integer(57);
        System.out.println(in.toString());


        // FORMATERS
        float f=10.234523f;
        System.out.printf("number is %.2f" ,f); //----> returns the formatted number

        System.out.printf("my name is %s and i am %s","chinnu","cool");

        //Methods of strings

        String e="kohli";
        System.out.println(e.charAt(0));




    }
}