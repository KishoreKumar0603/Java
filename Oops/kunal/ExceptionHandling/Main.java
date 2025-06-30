package Oops.kunal.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        // int a = 5;
        // int b = 0;
        // // try {
            
        // //     int c =  a/ b;
        // //     System.out.println(c);
        // // } catch (Exception e) {
        // //     System.out.println("Exception : "+e);            
        // //     System.out.println("Exception : "+e.getMessage());            
        // //     System.out.println("Exception : "+e.getClass());            

        // // }


        // int c = divide(a, 2);
        // System.out.println(c);



        //MyException

        try{
            String name = "kishre Kumar";
            if(!name.equals("Kishore kumar")){
                throw new MyException("Name is Not match with Kishore kumar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 2){
            throw new  ArithmeticException("B is 2");
        }

        return a/b;
    }
}
