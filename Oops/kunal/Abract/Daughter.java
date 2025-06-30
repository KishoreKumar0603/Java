package Oops.kunal.Abract;

public class Daughter extends Parent{
    
    @Override
    void career(){
        System.out.println("I am going to become a Coder");
    }

    @Override
    void partner(String name, int age){
        System.out.println("I love "+name+" and his age is "+age);
    }
}
