import java.util.*;

public class leetcode162 {
    public static void main(String[] args) {
        // int arr[] = { 9, 2, 1, 3, 5, 6, 7 };
        int arr[] = { 1, 2, 3, 1 };
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= arr.length - 2; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                set.add(arr[i]);

            }
        }
        if (arr[0] > arr[1]) {
            set.add(arr[0]);
        }
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            set.add(arr[arr.length - 1]);
        }
        System.out.println(Collections.max(set));
    }

}
