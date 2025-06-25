package Oops.kunal.Inheritance;

public class BoxWeight extends Box { 
    //extends from the Box class which means inherit the properties from the Box class
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l, h, w); // will call the parent constructure which suit the type
        this.weight = weight; // used to initialize values in present class


        // System.out.println(this.w);  /// this.w || super.w both are same if the parent class doesn't have w in both parent and child
        // super. will point to the parent class for ex. both classes have same named property like weight 
        // id you need to access the parent weight mean you can use super.weight 
        // else you want to access the childs weight you can use the this.weight keyword

        
    }
}
