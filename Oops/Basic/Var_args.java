package Oops.Basic;

public class Var_args {
    public static void getName(String... name)
    {
        for(String i:name)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        getName("kishore","jana");
    }
}
