package Oops.NestedInnerClass;
//Anonymous Class in Java

abstract class Demo {
    abstract void prin();
    
}
class nesa{
   public void re(){
        Demo a = new Demo(){
            @Override
            void prin(){
                System.out.println("Anonymous Class object");
            }
        };
        a.prin();
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        nesa a = new nesa();
        a.re();

    }
}
