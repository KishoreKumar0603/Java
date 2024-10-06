//Singleton class 
class ABC
{
    static ABC obj = null;
    private ABC(){}
    public static ABC getInstance()
    {
        if(obj==null)
            obj = new ABC();
        
        return obj;
    }
    void display()
    {
        System.out.println("New Singleton method");
    }
}
public class Singleton_class {
    public static void main(String[] args)
    {
        // ABC a = new ABC();  //cant create because we blocked constructor using private 
        ABC a = ABC.getInstance();
        a.display();
    }
    
}
