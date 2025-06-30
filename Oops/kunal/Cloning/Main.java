package Oops.kunal.Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kk = new Human(18, "Kishore Kumar");
        // Human lohieth = new Human(kk);

        Human lohieth = (Human)kk.clone();

        System.out.println(lohieth.name);


    }

}


