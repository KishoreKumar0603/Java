package Oops.kunal.Interface;

public class NiceCar {
    private Engine engine;
    private CDPlayer musicPlayer;
    public NiceCar(){
        engine = new PowerEngine();
        musicPlayer = new CDPlayer();
    }

    public NiceCar(Engine engine , CDPlayer musicPlayer){
        this.engine = engine;
        this.musicPlayer = musicPlayer;
    }
    
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

    public void accelerate(){
        engine.accelerate();
    }

    public void startMusic(){
        musicPlayer.start();
    }
    public void stopMusic(){
        musicPlayer.stop();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }

}
