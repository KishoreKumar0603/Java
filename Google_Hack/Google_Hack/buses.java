package Google_Hack;

import java.util.*;
public class buses {
    public static int countBuses(int curr, int[] passengers, int[][] adjmap, boolean[] visited, boolean hasPassenger) {
        visited[curr] = true;
        hasPassenger |= (passengers[curr] == 1);
        boolean isLeaf = true;
        int count = 0;
        
        for (int i = 0; i < adjmap.length; i++) {
            if (adjmap[curr][i] == 1 && !visited[i]) {
                isLeaf = false;
                count += countBuses(i, passengers, adjmap, visited, hasPassenger);
            }
        }
        
        if (isLeaf && hasPassenger) {
            count++;
        }
        
        visited[curr] = false;
        return count;
    }
    public static int minBuses(int N, int[] passengers, int[][] edges) {
        int[][] adjmap = new int[N + 1][N + 1];
        for (int i = 0; i < N - 1; i++) {
            int e1 = edges[i][0];
            int e2 = edges[i][1];
            adjmap[e1][e2] = 1;
            adjmap[e2][e1] = 1;
        }
        
        boolean[] visited = new boolean[N + 1];
        int totalBuses = 0;
        
        for (int i = 0; i <= N; i++) {
            if (adjmap[1][i] == 1) {
                totalBuses += countBuses(i, passengers, adjmap, visited, false);
            }
        }
        
        return totalBuses;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] pass = new int[n];
        for(int i=0;i<n;i++){
            pass[i] = scanner.nextInt();
        }
        int[][] arr = new int[1][1];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        // System.out.println(countBuses(n,pass,arr));


    }
}
