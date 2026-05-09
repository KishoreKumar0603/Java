
class A{
    void run(){
        System.out.println("from A");
    }
    // void run1(){
    //     System.out.println("null");
    // }
}

class B extends A{
    void play(){
        System.out.println("playing");
    }
//    @Override
    void run1() {
        System.out.println("From B");
    }
}
public class main {

    public static void main(String[] args) {
        // A arr = new A() {
        //     void run(){

        //         System.out.println("String....");
        //     }
        // };

        B arr = new B();

        arr.run();
    }
}
