import java.util.*;
public class news {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int maxCount = Integer.MIN_VALUE;

        for(int size = 1;size<=arr.length;size++)
        {
            for(int i =0;i<=arr.length - size;i++)
            {
                int sum = 0;
                int count = 0;
                for(int j=i;j<size - i;j++)
                {
                    sum+=arr[j];
                    count++;
                }
                if(sum < k  && count>maxCount )
                {
                    maxCount = count;
                }
            }
        }

        System.out.println(maxCount);
    
        scanner.close();
    }

}
