import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        // System.out.println(helper(6));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        System.out.println(sum);

    }

    public static int helper(int n) {
        if (n <= 1) {
            return (n);
        } else {
            return helper(n - 1) + helper(n - 2);

        }

    }

}
