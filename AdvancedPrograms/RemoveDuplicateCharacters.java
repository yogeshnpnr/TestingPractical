import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {
    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        
        for (char ch : str.toCharArray()) {
            uniqueChars.add(ch);
        }
        
        StringBuilder result = new StringBuilder();
        for (char ch : uniqueChars) {
            result.append(ch);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + output);
    }
}
