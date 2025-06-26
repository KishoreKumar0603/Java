package Oops.kunal.Polymorphism;

public class Number {
    int sum(int a, int b){
        System.out.println("parameter two int");
        return a+b;
    }

    int sum(int a, int b, int c){
        System.out.println("parameter three int");
        return a+b+c;
    }

    double sum(double a, double b){
        System.out.println("parameter Double");
        return a + b;
    }
}
