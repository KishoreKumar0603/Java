package Oops.kunal.Cloning;

public class Human implements Cloneable {
    int age;
    String name;

    public Human(int age , String name){
        this.age = age;
        this.name = name;
    }
    public Human(Human Other){
        this.age = Other.age;
        this.name = Other.name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
     
}
