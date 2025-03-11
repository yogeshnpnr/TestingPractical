import java.util.HashSet;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "w3schwwooools";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null.");
            return;
        }

        HashSet<Character> seen = new HashSet<>();  // Store characters encountered
        HashSet<Character> duplicates = new HashSet<>(); // Store duplicates

        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                duplicates.add(ch); // If already seen, it's a duplicate
            } else {
                seen.add(ch);
            }
        }

        System.out.println("Duplicate Characters are: " + duplicates);
    }
}
