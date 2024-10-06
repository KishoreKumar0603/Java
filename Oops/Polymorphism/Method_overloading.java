package Oops.Polymorphism;

class Mathope
{
    public void mul(int a ,int b)
    {
        System.out.println(a*b);
    }
    public int mul(int a,int b,int c)
    {
        return a*b*c;
    }
}
public class Method_overloading {
    public static void main(String... args)
    {
        Mathope o = new Mathope();
        o.mul(2, 3);
        int a = o.mul(2,3,4);
        System.err.println(a);
    }
}
