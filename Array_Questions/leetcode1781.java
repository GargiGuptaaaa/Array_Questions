import java.util.*;

public class leetcode1781 {
    public static void main(String[] args) {
        String s = "aabcbaa";
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            for (int j = i + 1; j < s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                sum += (Collections.max(map.values()) - Collections.min(map.values()));
            }

        }
        System.out.println(sum);
    }

}
