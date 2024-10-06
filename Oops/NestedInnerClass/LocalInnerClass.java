package Oops.NestedInnerClass;

class Outer 
{
    void nes()
    {
        class Inner//this class will have scope inside this nes() function alone
        {
            void print()
            {
                System.out.println("Local scope inner Class");
            }
        }
        Inner v = new Inner();
        v.print();
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer a = new Outer();
        a.nes();
        // Inner a = new Inner(); //it will show error 
    }
}
