public class LargestElementInArray {

    public static void main(String[] args) {
        // Predefined array
        int[] array = {10, 25, 5, 42, 8};

        // Find the largest element
        int largest = findLargest(array);

        // Print the result
        System.out.println("The largest element in the array is: " + largest);
    }

    public static int findLargest(int[] array) {
        int max = array[0]; // Assume the first element is the largest
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
