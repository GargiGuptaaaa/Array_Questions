public class leetcode1672 {
    public static void main(String[] args) {
        int accounts[][] = { { 1, 2, 3 }, { 3, 2, 1 } };

        int max_value = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];

            }
            if (sum > max_value) {
                max_value = sum;
            }
        }
        System.out.println(max_value);

    }

}
