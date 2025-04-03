
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;

public class Solutionss {
    public static void main(String args[]) {
        String s = "treeffff";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        ArrayList<Integer> frequencyList = new ArrayList<>(map.values());

        Collections.sort(frequencyList, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();

        for (int freq : frequencyList) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == freq) {
                    // Step 6: Append the corresponding character 'freq' number of times
                    for (int i = 0; i < freq; i++) {
                        result.append(entry.getKey());
                    }
                    // Remove the entry to avoid duplicate processing of the same character
                    map.remove(entry.getKey());
                    break; // Break since we found the character corresponding to this frequency
                }
            }
        }

        System.out.println(result.toString());
    }
}
