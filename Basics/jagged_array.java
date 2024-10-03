
public class Jagged_array /*array with unequal count of elements*/{
    public static void main(String[] args){
        int a[][] = {
            {10,10,12,12},
            {20,20,24},
            {30,30,48,48}
        };
        for(int i = 0;i < a.length;i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Enhanched for loop : ");
        for(int k[]:a){
            for(int d:k){
                System.out.print(" " + d);
            }
            System.out.println("");
        }
    }
}
