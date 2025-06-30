package Oops.kunal.Interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // car.accelerate();

        // car.start();
        // car.stop();

        // // Media carMedia = new Car();
        
        // // carMedia.start();

        NiceCar niceCar = new NiceCar();

        niceCar.start();
        niceCar.startMusic();
        niceCar.accelerate();
        niceCar.stop();
        niceCar.upgradeEngine(new ELectricEngine());
        niceCar.start();
        niceCar.accelerate();
        niceCar.stop();
    }
}
