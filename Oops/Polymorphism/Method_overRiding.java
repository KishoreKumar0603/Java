package Oops.Polymorphism;
//Method overriding 
class Father{  //Base class
    String name;
    int age;
    Father(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
class son extends Father //derived class
{
    int salary;
    son(String name,int age,int salary)
    {
        super(name,age);
        this.salary = salary;
    }
 public void info()
 {
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);    
    System.out.println("Salary : " + salary);    

 }   
}
public class Method_overRiding {
    public static void main(String[] args) {
        son o = new son("kishore",19,20000);
        o.info();
    }
}
