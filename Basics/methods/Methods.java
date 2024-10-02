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

    //No Return with Arguement
    public void sub(int a , int b){
        System.out.println("Subtraction of 2nums : "+(a - b));
    }

    //Return without Arguement
    public int mul(){
        int a = 29,b=2;
        return a*b;
    }

    //Return with Arguement
    public float div(float a, float b){
        return a/b;
    }

    //Recursion Function 
    public int fact(int num){
        if (num == 1)
            return 1;
        else
            return (num * fact(num - 1));
    }
}
public class Methods {
    
    public static void main(String[] args){
        fun s = new fun();
        s.add();
        s.sub(10, 5);
        int mul = s.mul();
        System.out.println(mul);
        float div = s.div(10, 2);
        System.out.println(div);
        int fact = s.fact(5);
        System.out.println(fact);
    }
}

