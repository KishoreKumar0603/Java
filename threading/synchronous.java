package threading;


class Table{
    synchronized void printTable(int n){
        for(int i=1;i<=5;i++)
        {
            System.out.println(i +" x "+ n +" = "+i  * n);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

public class synchronous {
    public static void main(String[] args) {
        Table table = new Table();
        // table.printTable(5);
        Thread t1 = new Thread(){
            public void run()
            {
                table.printTable(5);
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                table.printTable(3);
            }
        };

        t1.start();
        t2.start();
    }
}
