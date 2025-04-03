import java.util.Arrays;

public class two_sum1 {
    public static void twosum(int arr[], int target) {
        // bruteforce technique
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] + arr[j] == target) {
        // System.out.println("indexes are : " + i + " , " + j);
        // }
        // }
        // }
        // optimized technique
        // step 1 : firstly sort the array
        Arrays.sort(arr);
        System.out.println("print sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int start = 0;
        int end = arr.length - 1;
        // // step 2 begins

        while (start < end) {
            if (arr[start] + arr[end] == target) {
                System.out.println("indexces : " + start + " , " + end);
            } else if (arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 1, 4 };
        int target = 4;
        twosum(arr, target);

    }

}
