import java.util.HashSet;
import java.util.Set;

public class PairCommonElementsInArrays {
    public static void findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        // Add elements of arr1 to set
        for (int num : arr1) {
            set.add(num);
        }

        // Check common elements in arr2
        for (int num : arr2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }

        // Print result
        System.out.println("Common elements: " + common);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 4};
        findCommonElements(arr1, arr2);
    }
}
