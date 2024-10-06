package Oops.Basic;
//Constructor in java
class RectangleShape{
    int length,width;

    public RectangleShape()
    {
        length = 2;
        width = 1;
        System.out.println("constructor called");
    }
    int area()
    {
        return length * width;
    }
}
public class Constructor {
    public static void main(String[] args){
        RectangleShape o = new RectangleShape();
        System.out.println(o.area());
    }
}
