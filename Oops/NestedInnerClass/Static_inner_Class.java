package Oops.NestedInnerClass;

class outers {
    static int x=10;
    static int y=19;
    static class inner {
        void display()
        {
            System.out.println(x+y); //if we want to access a var that should be static var;
        }
        
    }
}
public class Static_inner_Class {
 public static void main(String[] args) {
    // outer.inner a = new outers.inner();
    // a.display();
 }    
}
