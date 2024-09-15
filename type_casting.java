// TYpe casting
/*
        Widening Casting 
            byte -> short -> char -> int -> long -> float -> double 
        Narrowing Casting
            double -> float -> long -> int -> char -> short -> byte
 */
public class type_casting {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println("Int :"+a);
        System.out.println("double :"+b);


        double d = 34.33;
        int s = (int) d;
        System.out.println("Double :" + d);
        System.out.println("Int :" + s);
        
        String str = "21";
        int str_num = Integer.parseInt(str);
        System.out.println("Nummber : " + str_num );
    }
}
