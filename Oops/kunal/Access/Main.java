package Oops.kunal.Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "kishore");

        //need to do few things
        //1. access the data members
        //2.modify the data members


        System.out.println("Num : "+obj.getNum()); //accessing the private num variable via getter methos
        
        obj.setNum(15); // set new value to the private num variable via setter method
        System.out.println("Update Num value after setter : "+obj.getNum());


        
    }
}
