package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {

        int a = 10,b =0;
        int[] arr = null;
        try{
            System.out.println(arr[0]);
            int c = a/b;
            System.out.println(c);
            System.out.println("Kishore kumar");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }catch(NullPointerException e)
        {
            System.err.println(e);
        }
    }


    
}