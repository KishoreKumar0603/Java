package Oops.Basic;
class Rectangle{
    int length;
    int width;
    void getDetails(int a, int b){
        length = a;
        width = b;
    }

    int area(){
        int a = length * width;
        return a;
    }
}
public class Class_object {
    public static void main(String[] args){
        Rectangle object_1 = new Rectangle();
        object_1.length=10;
        object_1.width = 20;
        System.out.println(object_1.area());
        object_1.getDetails(5,6);
        System.out.println(object_1.area());
    }
}
