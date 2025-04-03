import java.util.*;

public class leetcode73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 3;
        int n = 4;
        int matrix[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    map.put(i, j);
                }
            }
        }
        for (int k = 0; k < m; k++) {
            if (map.containsKey(k)) {
                for (int l = 0; l < matrix[k].length; l++) {
                    matrix[k][l] = 0;
                }
            }
        }
        for (int o = 0; o < n; o++) {
            if (map.containsValue(o)) {
                for (int p = 0; p < matrix[o].length; p++) {
                    matrix[o][p] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}