package interfaces;

public class Nicecar {
    private engine engine;
    private media player=new cdplayer();
    public Nicecar(){
        engine=new powerengine();
    }
    public Nicecar(engine engine){
        this.engine=engine;
    }

    public void start(){
        engine.start();
    }
    public void startMusic(){
        player.start();
    }
    public void Upgradeengine(){
        this.engine=new electricengine();
    }



}
