package Oops.NestedInnerClass;

class Outer {
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
    Outer.inner a = new Outer.inner();
    a.display();
 }    
}
