import java.util.*;
import java.io.*;

public class PrefixSum {

    public static int findPrefixSum(int[][] arr, int r1, int r2, int c1, int c2) {

        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += arr[i][j];
            }
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Rows");
        int m = sc.nextInt();
        System.out.println("Enter the no. of Columns");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter elements in Matrxi");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter r1 coordinates");
        int r1 = sc.nextInt();
        System.out.println("Enter r1 coordinates");
        int c1 = sc.nextInt();
        System.out.println("Enter r1 coordinates");
        int r2 = sc.nextInt();
        System.out.println("Enter r1 coordinates");
        int c2 = sc.nextInt();

        int result = findPrefixSum(arr, r1, r2, c1, c2);
        System.out.println("Prefix Sum is :- " + result);
    }

}
