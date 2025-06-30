package Oops.kunal.Interface;

public class ELectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electic Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electic Engine stops");
    }

    @Override
    public void accelerate() {
        System.out.println("Electic Engine Accelerate");
    }
    
}
