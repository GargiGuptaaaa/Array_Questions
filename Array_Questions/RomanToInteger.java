import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (romanMap.containsKey(currentChar)) {

                total += romanMap.get(currentChar);
            }
        }

        System.out.println(total);
    }

}
