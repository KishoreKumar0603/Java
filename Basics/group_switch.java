
import java.util.Scanner;
public class Group_switch {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter a Letter : ");
        char choice = in.next().charAt(0);
        switch(choice){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowels");
                break;
            default:
            System.out.println("not A Vowel");break;
        }

    }
}
