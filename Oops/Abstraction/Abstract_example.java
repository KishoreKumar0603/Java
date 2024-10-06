package Oops.Abstraction;
//Example for Abstraction in java

abstract class Mobile
{
    void call(){
        System.out.println("You can make voice call");
    }
    abstract void camera();
    abstract void touch_screen();
}

class Samsung extends Mobile
{
    @Override
    void camera(){
        System.out.println("8mp camera");
    }

    @Override
    void touch_screen()
    {
        System.out.println("LCD touch panel");
    }
}
class Nokia extends Mobile
{

    @Override
    void camera() {
        System.out.println("16mp Camera");
    }

    @Override
    void touch_screen() {
        System.out.println("LED touch panel");
    }
    
}
public class Abstract_example {
    public static void main(String[] args)
    {
        Samsung m32 = new Samsung();
        Nokia n1 = new Nokia();
        m32.call();
        m32.camera();
        m32.touch_screen();
        n1.call();
        n1.camera();
        n1.touch_screen();
    }   
}
