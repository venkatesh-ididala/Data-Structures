package exceptionhandling;

public class main {
    public static void  main(String[] args) {
        int a=8;
        int b=0;
        /*try {
            throw new Exception("just for fun");
        }*/

        try{
            String name="chinnu";
            if(name.equals("chinnu")){
                throw new MyException("name is chinnu");
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("normal exception");
        }
        finally {
            System.out.println("this will always execute");
        }



    }
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide by zero");  //-->explicitly throwing the exception message
        }
        return a/b;
    }
}
