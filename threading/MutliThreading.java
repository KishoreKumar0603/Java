package threading;





class Book implements Runnable{
// class Book extends Thread{
    // public void run(){
    //     updateDb();
    // }
    public void run(){
        for(int i =0;i < 5 ;i++)
        {
            System.out.println("Updating DB");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Num extends Thread{
    public void run(){
        for(int i = 0;i < 5;i++)
        {
            System.out.println(i);
            try{
                Thread.sleep(5000);
            }
            catch(Exception error)
            {
                error.printStackTrace();
            }
        }
    }
}
public class MutliThreading {
    public static void main(String[] args) throws InterruptedException { //thread
        Runnable book = new Book(); //Thread
        Runnable num = new Num(); //Thread
        Thread t1 = new Thread(book);
        t1.setName("Book");
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        t1.setPriority(3);
        System.out.println(t1.getPriority());
        t1.start(); //run

        Thread t2 = new Thread(num);
        
        t2.start();

        t1.join();
        t2.join();

        
        // book.start();     //Need to extends Thread Class
        // num.start();     //Need to extends Thread Class
        // book.join();     //Need to extends Thread Class
        // num.join();      //Need to extends Thread Class
        System.out.println("Task Completed Bye...");
    }

}
