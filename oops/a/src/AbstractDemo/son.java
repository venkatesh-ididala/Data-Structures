package AbstractDemo;

public class son  extends parent{
    public son(int age){
        super(age);
    }
    void normal(){
        super.normal();
    }
    @Override
    void career(){
        System.out.println("I am going to be doctor");
    }
    @Override
    void  partner(){
        System.out.println("SHE IS ANGELA");
    }
}
