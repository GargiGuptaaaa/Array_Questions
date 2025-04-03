import java.util.*;

public class duplicate_missing {
    public static void main(String[] args) {
        int result[] = new int[2];
        int arr[] = { 1, 2, 3, 3, 5 };
        int n = arr.length;
        int sum = n * (n + 1) / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr_sum = 0;
        for (int i = 0; i < n; i++) {
            arr_sum += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int duplicate = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicate = entry.getKey();
                break;
            }
        }
        result[0] = duplicate;
        System.out.println(arr_sum);
        result[1] = sum - (arr_sum - duplicate);
        System.out.println(result[0] + " " + result[1]);

    }

}




