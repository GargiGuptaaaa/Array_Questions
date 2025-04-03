public class max_integer {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 10, 3, 2 };
        int i = 0;
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (i = 0; i < arr.length - 1; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}
