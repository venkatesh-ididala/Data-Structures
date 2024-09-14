package interfaces;

public class powerengine implements engine {
    @Override
    public void start(){
        System.out.println("powerengine starts");
    }
    @Override
    public void stop(){
        System.out.println("powerengine stops");
    }
    @Override
    public void acc(){
        System.out.println("powerengine accelerated");
    }
}
