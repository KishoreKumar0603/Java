package Oops.NestedInnerClass;
//Nested inner class in java

class outer {
    int a =50;
    class inner{
        int b = 45;
        void innerDisplay()
        {
            System.out.println("Inner class display");
            System.out.println("Sum : "+ (a+b));
        }
    }
    void outerDisplay(){
        System.out.println("Outer class display");
        inner a = new inner();
        a.innerDisplay();
    }
}
public class NestedClass {
    public static void main(String[] args) {
        outer a = new outer();
        a.outerDisplay();
        //creating object for inner class
        System.out.println("\n\nInner class\n--------------");
        outer.inner o = new outer().new inner();
        o.innerDisplay();
    }
}
