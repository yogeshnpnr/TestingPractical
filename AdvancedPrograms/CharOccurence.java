import java.util.HashMap;
import java.util.Map;

public class CharOccurence {
    public static void main(String[] args) {
        String str = "HELLO INDIA";
        printCharFrequency(str);
    }

    public static void printCharFrequency(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string and count occurrences
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue; // Ignore spaces

            // Increment count in the map
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        // Print character frequencies
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
