package Google_Hack;
import java.util.Arrays;
import java.util.Scanner;
public class maximumScore {
    public static int printMaximum(int[] arr)
    {
        int maximum = 0;
        int i =0,j = arr.length - 1;
        Arrays.sort(arr);
        while (i <j) {
            int diff = Math.abs(arr[j] - arr[i]);
            maximum += diff;
            i++;
            j--;
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTimes = scanner.nextInt();
        int[] result = new int[noOfTimes];
        for(int i =0;i<noOfTimes;i++)
        {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for(int j =0;j<N;j++)
            {
                arr[j] = scanner.nextInt();
            }
            result[i] = printMaximum(arr);
        }

        for(int i:result)System.out.println(i);
        scanner.close();
    }
}
