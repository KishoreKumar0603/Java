package Oops.Inheritance;
//Hierarchical Inheritance
class Shape
{
    float length,breath,radius;
}

class Rectangle extends Shape
{
    Rectangle(float l, float b)
    {
        length = l;
        breath = b;
    }
    public void area(){
        System.out.println("Area of Rectangle : "+ (length * breath));
    }
}

class Circle extends Shape
{
    Circle(int r)
    {
        radius = r;
    }
    public void area()
    {
        System.out.println(Math.PI * (Math.pow(radius, 2)));
    }
}
public class Hierarchical_inher {
    public static void main(String[] args)
    {
        Rectangle a = new Rectangle(10, 2);
        Circle cd = new Circle(10);
        a.area();
        cd.area();
    }
}
