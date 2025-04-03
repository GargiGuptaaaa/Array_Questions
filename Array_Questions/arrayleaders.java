import java.util.*;

public class arrayleaders {
    public static void main(String[] args) {
        int arr[] = { 30, 10, 10, 5 };
        int n = arr.length;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] <= arr[i]) `{
                    count++;
                }
            }
            if (count == n - i - 1) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);

    }

}
