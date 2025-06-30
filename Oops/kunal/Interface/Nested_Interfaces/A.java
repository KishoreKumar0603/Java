package Oops.kunal.Interface.Nested_Interfaces;

public class A {
    //nested Interface

    public interface nestedInterface {
        boolean isOdd(int n);
        
    }
}

class B implements A.nestedInterface{
    @Override
    public boolean isOdd(int n){
        return (n &  1) == 1;
    }
}

class Main{
    public static void main(String[] args) {
        B b = new B();

        System.out.println(b.isOdd(6)? "Odd" : "Even");
    }
}
