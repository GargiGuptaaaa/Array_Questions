import java.util.*;

public class leetcode118 {
    public static void main(String[] args) {
        // System.out.println(fact(5));
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = 5;
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                int sum = fact(i) / ((fact(j) * fact(i - j)));
                list.get(i).add(sum);

            }
        }
        System.out.println(list);

    }

    public static int fact(int i) {

        if (i == 0 || i == 1) {
            // System.out.println(1);
            return 1;
        } else {
            // System.out.println(i * fact(i - 1));
            return i * fact(i - 1);
        }
    }

}
