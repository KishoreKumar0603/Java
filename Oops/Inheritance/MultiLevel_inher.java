package Oops.Inheritance;
//Multi-Level inheritance

class Grandfather
{
    public void house()
    {
        System.out.println("Own a house by GrandFather");
    }
}

class Father extends Grandfather
{
    public void land()
    {
        System.out.println("10Acres of Land own by father");
    }
}
class Son extends father
{
    public void car()
    {
        System.out.println("Audi Car own by Son");
    }
}
public class MultiLevel_inher {
    public static void main(String[] args)
    {
        Son o = new Son();
        // o.land();
        o.car();
        o.house();
    }
}
