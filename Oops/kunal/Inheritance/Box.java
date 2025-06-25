package Oops.kunal.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l =  this.h = this.w = -1;
    }

    //cube
    Box(double side){

        // super(); // point to Object class represented by java

        this.l = this.h = this.w = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }


    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box"); 
    }

}
