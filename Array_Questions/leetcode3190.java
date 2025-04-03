public class leetcode3190 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {

            } else {
                sum = sum + 1;
            }
        }
        System.out.println(sum);

    }
}
