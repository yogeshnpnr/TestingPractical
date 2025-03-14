import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0'; // Return null character if no unique char found
    }

    public static void main(String[] args) {
        String str = "swiss";
        char result = findFirstNonRepeatedChar(str);
        System.out.println("First non-repeated character: " + (result != '\0' ? result : "None"));
    }
}
