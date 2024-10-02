package Oops;
//copy constructor

class complex
{
    private int real, img;
    public complex(){
        this.real = 0;
        this.img = 0;
    }
    public complex(int r, int i)
    {
        this.real = r;
        this.img = i;
    }

    public complex(complex o)
    {
        this.real = o.real;
        this.img = o.img;
    }
    public complex(int a , int b, complex o)
    {
        this.real = a+o.real;
        this.img = b+o.img;
    }
    public String toString(){
        return "( " + real + " + "+img +"i )";
    }
}
public class Copy_Constructor {
    public static void main(String[] args){
        complex o = new complex();
        System.out.println(o);

        complex o1 = new complex(10,3);
        System.out.println(o1);
        
        complex o2 = new complex(o1);
        System.out.println(o2);

        complex o3 = new complex(1,2,o2);
        System.out.println(o3);
    }

}
