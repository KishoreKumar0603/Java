package Oops.kunal.Interface;

public class Car implements Engine, Brake, Media{

    @Override
    public void brake() {
        System.out.println("Braking....");
    }

    @Override
    public void start() {
        System.out.println("Starting....");
    }

    @Override
    public void stop() {
        System.out.println("Stopping....");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate....");
    }

    
    
}
