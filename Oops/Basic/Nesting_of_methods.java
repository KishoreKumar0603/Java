package Oops.Basic;
//Nesting of methods in java
class demo
{
    private int n,m;
    demo(int n,int m)
    {
        this.n = n;
        this.m = m;
    }

    int largest()
    {
        if(m > n)
        {
            return m;
        }
        else
        {
            return n;
        }
    }

    void print()
    {
        int largest = largest();
        System.out.println("largest Number : "+ largest);
    }
}
public class Nesting_of_methods {
    public static void main(String[] args) {
     demo s = new demo(10,3);
     s.print();   
    }
}
