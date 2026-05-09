package abstraction;

public class Main {
    public static void main(String[] args) {
        
        // Abs a = new Abs() {
        //     void run(){
        //         System.out.println("Overrided class");
        //     }
        // };

        // a.run();

        Abs a = new Abs() {
            void run(){
                System.out.println("Null");
            }
        };
//        a.run();
        a.move();
        a.play();
        System.out.println(a.a);

    }
}
