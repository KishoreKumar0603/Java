package Oops.Inheritance;
//single inheritance
class father  //Base class
{
    public void house()
    {
        System.out.println("Father own`s house");
    }
}

class son extends father //derived class
{
    public void car()
    {
        System.out.println("Son owns a Audi car");
    }
}
public class Single_inher {
    public static void main(String[] args) {
        son s = new son();
        s.car();
        s.house();
    }
}
