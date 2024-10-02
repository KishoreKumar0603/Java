package methods;
import java.util.Scanner;
public class return_array_method {
    public static int[] arr_creation(){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter arr SIze : ");
        n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = in.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = arr_creation();
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
