public class max_sub_array {
    public static void sub_arr(int arr[]) {
        int current_sum = 0;
        int maximum_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                current_sum = 0;
                for (int k = start; k <= end; k++) {
                    current_sum += arr[k];
                    if (current_sum > maximum_sum) {
                        maximum_sum = current_sum;
                        System.out.println(current_sum);
                    }
                }
                System.out.println();
            }
        }
        System.out.println(maximum_sum);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        sub_arr(arr);
    }
}
