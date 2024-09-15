
public class unary {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before Increament : " +a);

        a++;
        System.out.println("After Increament : " + a);

        System.out.println( "it will not icreament while printing : "+ a++); //program compile like top-bottom && right-left
        System.out.println(a);
    }
}
