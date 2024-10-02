package Oops;

//getter and setter in oops (data hiding)
class ShapeRectangle{
    private int length;
    private int width;
    void setLength(int a)
    {
        length = a;
    }

    int getLength()
    {
        return length;
    }

    void setWidth(int b)
    {
        width = b;
    }

    int getWidth()
    {
        return width;
    }

    int area(){
        int a = length * width;
        return a;
    }
}
public class set_get {
    public static void main(String[] args){
        ShapeRectangle obj1 = new ShapeRectangle();
        /* obj1.length = 0; //Show error because the var length is private for this we need getter & setter */
        obj1.setLength(10);
        obj1.setWidth(2);
        int le = obj1.getLength();
        int wi = obj1.getWidth();
        System.out.println("length : " + le +" Width : " + wi);
        System.out.println("area : " + obj1.area());

        //for setting value usign setter method
        obj1.setLength(89);
        obj1.setWidth(10);
        System.out.println("length : " + obj1.getLength() +" Width : " + obj1.getWidth());
    }
}
