import java.util.*;

public class leetcode3043 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 26 };
        int[] arr2 = { 22, 2 };
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            String str1 = Integer.toString(arr1[i]);
            for (int j = 0; j < arr2.length; j++) {
                int count = 0;
                String str2 = Integer.toString(arr2[j]);
                int k = 0;
                while (k < str1.length() && k < str2.length()) {
                    if (str1.charAt(k) == str2.charAt(k)) {
                        count++; // Increase count when characters match
                    } else {
                        break; // Break if characters don't match
                    }
                    k++;
                }
                set.add(count);

            }

        }
        if (!set.isEmpty()) {
            System.out.println("Maximum matching prefix length: " + Collections.max(set));
        } else {
            System.out.println("Set is empty, no matching prefix found.");
        }

    }
}
