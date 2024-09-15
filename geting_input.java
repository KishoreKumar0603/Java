import java.util.Scanner;


public class geting_input {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a*a);
        
        /*
         scanner.nextInt()
         scanner.nextFloat()
         scanner.nextDouble()
         scanner.next()      ---> getting a word
         scanner.nextLine()  ---> getting line 
         */

        //to check all the packages run javap java.util.Scanner in cmd
    }
}
