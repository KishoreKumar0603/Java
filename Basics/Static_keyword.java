//Static variable and Methods

class Static_test
{   
    static int a = 10;
    int b =12;//instance variable
    void show()
    {
        System.out.print("A : "+a);
        System.out.print(" B : "+b+"\n");
    }
    static void display()
    {
        System.out.println("A : "+a);
        System.out.println("B : "+b);//error 
    }
}
public class Static_keyword {
    public static void main(String[] args) {
        Static_test o1 = new Static_test();
        o1.show();
        Static_test o2 = new Static_test();
        o2.b = 100;
        o2.show();
        o1.show();
        System.out.println("Changing static var value>>>>");
        o2.a=23;
        o2.show();
        o1.show();
    }
}
