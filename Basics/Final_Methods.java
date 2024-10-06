class Super
{
    public void display()
    {
        System.out.println("I am Super class Display method");
    }


    final void final_display()
    {

        System.out.println("I am Super class final display");
    }
}
class sub extends Super
{

    @Override
    public void display()
    {
        System.out.println("I am Sub class Display method");
    }
    // @Override
    // public void final_display()
    // {
    //     System.out.println("I am Sub class final display");      //it will show error , final method can be used but can't override
    // }

}
public class Final_Methods {
    public static void main(String[] args) {
      sub a = new sub();
      a.display();
      a.final_display();  
    }
}
