import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesIntegerHashSet {
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : arr) {
            uniqueNumbers.add(num);
        }

        // Convert Set to Array
        int[] result = new int[uniqueNumbers.size()];
        int i = 0;
        for (int num : uniqueNumbers) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 4, 8, 2, 1, 9, 7};
        int[] uniqueNumbers = removeDuplicates(numbers);
        
        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}
