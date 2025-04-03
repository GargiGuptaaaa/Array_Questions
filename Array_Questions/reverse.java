
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 5, 4 };
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
j
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
}
