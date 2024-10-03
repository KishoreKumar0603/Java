package Oops;
//array of objects in java 
class Student
{
    public int roll_no;
    public String name;
    Student(int roll,String name)
    {
        this.roll_no = roll;
        this.name = name;
    }
    void print()
    {
        System.out.println("Name    : "+ name);
        System.out.println("Roll no : "+roll_no);
        System.out.println("-------------------");
    }
}
public class Array_of_objects {
    
    public static void main(String[] args) {
        /*//code increased to reduce we use array of objects like structure in C
        Student std1 = new Student(288, "kishore");
        std1.print();

        Student std1 = new Student(288, "kishore");
        std1.print();
        */

        Student[] arr;
        arr = new Student[3];
        arr[0] = new Student(1, "Kishore");
        arr[1] = new Student(2, "kumar");
        arr[2] = new Student(3, "dfja");

        for(Student a: arr)
        {
            a.print();
        }
        


    }
}
