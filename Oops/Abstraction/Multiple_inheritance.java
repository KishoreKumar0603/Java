package Oops.Abstraction;

interface Frontend
{
    public default void design()
    {
        System.out.println("Can code in Front-end");
    }
}
interface backend
{
    public default void server()
    {
        System.out.println("Can code for server side");
    }
}
class fullstacker implements Frontend,backend
{
    public void host()
    {
        System.out.println("Can host the site ");
    }
}
public class Multiple_inheritance {
public static void main(String[] args) {
    fullstacker u1 = new fullstacker();
    u1.design();
    u1.server();
    u1.host();
}
}
