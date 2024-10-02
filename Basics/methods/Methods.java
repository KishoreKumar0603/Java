package methods;
import java.util.Scanner;
class fun{
    //No Return Without Arguement
    public void add(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Element a : ");
        int a = in.nextInt();
        System.out.print("Enter Element b : ");
        int b = in.nextInt();
        System.out.println("Sum of 2nums : "+ (a+b));


    }
}
public class Methods {
    
    public static void main(String[] args){
        fun s = new fun();
        s.add();
    }
}

