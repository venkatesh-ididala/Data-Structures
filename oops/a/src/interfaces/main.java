package interfaces;

public class main {
    public static void main(String[] args) {
        car c=new car();
       // c.start();
       // c.stop();
      //  c.brake();

        media carmedia=new car();
        carmedia.start();

        Nicecar car=new Nicecar();
        car.start();

        car.Upgradeengine();
        car.start();

    }


}
