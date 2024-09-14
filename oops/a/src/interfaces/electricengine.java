package interfaces;

public class electricengine implements engine {
    @Override
    public void start(){
        System.out.println("electric engine starts");
    }
    @Override
    public void stop(){
        System.out.println("electric engine stop");
    }
    @Override
    public void acc(){
        System.out.println("electric engine accelerated");
    }
}
