import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;

class solutions {
    public static void main(String[] args) {
        String s = "tree";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create a list of entries (key-value pairs) from the HashMap
        ArrayList<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        System.out.println(entryList);

        // Step 3: Sort the list of entries by their values (frequencies) in descending
        // order
        Collections.sort(entryList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> entry1, Map.Entry<Character, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue()); // Sort by frequency (value) in descending order
            }
        });

        // Step 4: Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Step 5: Append each character to the result based on its frequency
        for (Map.Entry<Character, Integer> entry : entryList) {
            char c = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                result.append(c);
            }
        }

        // Step 6: Return the result as a string
        System.out.println(result.toString());
    }
}
