package TapAcademy;

import java.util.*;
class JaggedArray
{
    public static void D2Jagged()
    {
        Scanner a = new Scanner(System.in);
        int[][] arr = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[5];
        for(int i =0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                System.out.print("Enter class"+i+" students: ");
                arr[i][j] = a.nextInt();
            }
        }
        System.out.println("Studens List ..............");
        for(int i =0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        a.close();

    }

    public static void D3Jagged()
    {
        Scanner scan = new Scanner(System.in);
        int[][][] arr = new int[2][][];
        arr[0] = new int[2][];
        arr[1] = new int[3][];
        arr[0][0] = new int[3];
        arr[0][1] = new int[3];
        arr[1][0] = new int[3];
        arr[1][1] = new int[3];
        arr[1][2] = new int[3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                for(int k =0;k<arr[i][j].length;k++)
                {
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
        for(int[][] i:arr)
        {
            for(int[] j:i)
            {
                for(int k:j )
                {
                    System.out.print(k+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        D3Jagged();
        // D2Jagged();
    }
}