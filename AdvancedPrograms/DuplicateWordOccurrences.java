import java.util.*;
public class DuplicateWordOccurrences {
    public static void main(String[] args) {
        String sentence = "my name is anil kumar and father name is sunil kumar";

        // Convert sentence into an array of words
        String[] words = sentence.toLowerCase().split("\\s+"); // Splitting by spaces

        // Use LinkedHashMap to maintain insertion order
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Display duplicate words
        System.out.println("Duplicate Words and Their Occurrences:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }}}}
