package Oops.Abstraction;
interface Animal
{
    void sound();        //public abstract void sound(); default format
    void sleep();
}
class Dog implements Animal
{
    @Override
    public void sound()
    {
        System.err.println("Dod sounds like woofwoof");
    }
    @Override
    public void sleep()
    {
        System.err.println("Dog is sleeping");
    }
}
public class Interface {
    
public static void main(String[] args) {
    Dog a = new Dog();
    a.sound();
    a.sleep();
}
}
