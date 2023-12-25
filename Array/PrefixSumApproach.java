import java.util.*;
import java.io.*;

public class PrefixSumApproach {

    public static void prefixSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        // Row wise Prefix Sum
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

        // Column Wise Prefix Sum

        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    public static int sumRegion(int[][] arr, int r1, int c1, int r2, int c2) {
        int sum, up, left, repeated_region = 0;

        sum = arr[r2][c2];
        up = arr[r1 - 1][c2];
        left = arr[r2][c1 - 1];
        repeated_region = arr[r1 - 1][c1 - 1];

        int result = sum - up - left + repeated_region;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Rows :- ");
        int m = sc.nextInt();

        System.out.println("Enter Number of Columns :- ");
        int n = sc.nextInt();

        System.out.println("Enter Elements in Matrxi");
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter r1 coordinates :- ");
        int r1 = sc.nextInt();
        System.out.println("Enter c1 coordinates :- ");
        int c1 = sc.nextInt();
        System.out.println("Enter r2 coordinates :- ");
        int r2 = sc.nextInt();
        System.out.println("Enter c2 coordinates :- ");
        int c2 = sc.nextInt();

        prefixSum(arr);
        int finalsum = sumRegion(arr, r1, c1, r2, c2);
        System.out.println("Final prefix Sum is :- " + finalsum);

    }

}
