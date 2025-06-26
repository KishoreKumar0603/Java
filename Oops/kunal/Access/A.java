package Oops.kunal.Access;

public class A {


    /*default    ----->  only inside package
     * public    ----->  provide access to all file in anywhere
     * private   ----->  provide access anywhere in its file not other files 
     * protected ----->   
     * 
     */
    
    private int num; //remove access for external files
    public String name;       //providing access to all files
    protected int[] arr;

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }


    //getter method for num variable
    public int getNum(){
        return num;
    }
    //setter method for num variable
    public void setNum(int num){
        this.num = num;
    }


}
