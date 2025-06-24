package Oops.kunal;


class Student{
    int roll;
    String name;
    Student(){
        this(1,"name");
    }

    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

}

public class Introduction {
    public static void main(String[] args) {
        // final int BONUS = 1;
        // Student person1 = new Student(2,"kishore");
        // System.out.println(person1.name);
        // Student copy = person1;
        // System.out.println(copy.name);
        // copy.name = "kumar";
        // System.out.println(copy.name+" "+person1.name);
        // System.out.println(person1);





    }
}
