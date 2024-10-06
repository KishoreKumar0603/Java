package Oops.Abstraction;
//abstract class in java

abstract class Shape
{
    abstract void draw();
    void msg()
    {
        System.out.println("msg from class shape");
    }
}
/* When inheriting the abstract class we should override the abstract function  */

class Rectangle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing in Rectangle class");
    }
}
public class Abstract_class {
    public static void main(String[] args)
    {
        Rectangle o = new Rectangle();
        o.draw();
        o.msg();
        // Shape a = new Shape(); //it will cause error abstract class can't callable

    }
}
