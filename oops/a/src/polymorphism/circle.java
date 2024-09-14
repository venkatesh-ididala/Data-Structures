package polymorphism;



public class circle extends shapes {
    //this will run when the circle class obj is created
    //this method overriding the parent class method
    @Override //this is called annotation --> check
    void area(){
        System.out.println("Area is pie * r* r");
    }

}
