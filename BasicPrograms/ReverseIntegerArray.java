import java.util.Arrays;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6};  // Array initialization
        System.out.println("Array length: " + arr.length);

        System.out.print("Array in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");  // Print in the same line
        }
        System.out.println();  // New line after the loop
    }
}
