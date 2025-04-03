import java.util.*;

public class leetcode48 {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = matrix.length;

        // Brute Force Approach
        // int arr[][] = new int[n][n];
        // for (int i = matrix.length - 1, k = 0; i >= 0; i--, k++) {
        // for (int j = 0, l = 0; j < matrix.length; j++, l++) {
        // arr[l][k] = matrix[i][j];
        // }
        // }
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        for (int i = matrix.length - 1, k = 0; i >= 0; i--, k++) {
            for (int j = 0, l = 0; j < matrix.length; j++, l++) {
                int temp = matrix[l][k];
                matrix[l][k] = matrix[i][j];
            }

        }

    }

}
