public class loop_special {
    public static void main(String[] args) {
        int sum = 0;
        int arr[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };
        int i = 0;
        while (i < arr.length) {
            sum = sum + arr[i][i];
            i++;

        }
        System.out.println(sum);
        int j = 0;
        int sum1 = 0;
        while ((i + j) == arr.length - 1) {
            sum1 = sum1 + arr[i][j];
            i++;
            j++;
        }
        System.out.println(sum1);
        int sum_t = sum + sum1;
        System.out.println(sum_t);
    }
}