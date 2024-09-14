package AbstractDemo;

public abstract  class parent {

    int age;
    final int VALUE;
    public parent(int age){
        this.age=age;
        VALUE=232223;
    }
    abstract void career();
    abstract void partner();

    void normal(){
        System.out.println("this is normal method");
    }

    static void message(){
        System.out.println("hey hii");
    }
}
