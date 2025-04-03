import java.util.*;

public class gfg {
    public static void main(String[] args) {
        int arr[] = { 642, 216, 187, 135, 28, 706, 661, 353, 890, 890 };
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = arr[i];
            int s_smallest = Integer.MAX_VALUE;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <= smallest) {
                    int temp = smallest;
                    smallest = arr[j];
                    s_smallest = temp;
                } else {
                    if (arr[j] > smallest && arr[j] < s_smallest) {
                        s_smallest = arr[j];
                    }
                }
                set.add(smallest + s_smallest);
            }

        }
        int maxValue = Collections.max(set);
        System.out.println(maxValue);
        System.out.println(set);

    }
}
