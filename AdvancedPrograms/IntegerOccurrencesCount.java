import java.util.HashMap;
import java.util.Map;

public class IntegerOccurrencesCount {
    public static void countOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each number
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Print occurrences
        System.out.println("Element occurrences:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5, 1, 2};
        countOccurrences(arr);
    }
}
