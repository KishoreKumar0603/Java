package Oops;
//Parameterizeed Constructor & constructor over loading in java

class RectangleShapes{
    int length,width;

    public RectangleShapes()
    {
        length = 2;
        width = 1;
        System.out.println("constructor called");
    }
    public RectangleShapes(int a)
    {
        length=a;
        width = a;
        System.out.println("single Parameter constructor called");
    }
    public RectangleShapes(int a, int b)
    {

        length = a;
        width = b;
        System.out.println("Double parameterized constructor called");
    }

    public RectangleShapes(Double a , Double b)
    {
        System.out.println("Float type parameter constuctor called");
    }
    int area()
    {
        return length * width;
    }
}
public class Constructor_overloading {
    public static void main(String[] args){
        RectangleShapes o = new RectangleShapes();
        System.out.println(o.area());
        
        RectangleShapes o1 = new RectangleShapes(10);
        System.out.println(o1.area());

        RectangleShapes o2 = new RectangleShapes(10,3);
        System.out.println(o2.area());

        RectangleShapes o3 = new RectangleShapes(2.2,3.2);
        System.out.println(o3.area());
    }
}
