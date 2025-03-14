public class SmallestElementinInteger {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 25};
        System.out.println("Smallest element: " + findSmallest(arr));
    }

    public static int findSmallest(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        int min = arr[0]; // Assume first element is smallest

        for (int num : arr) {
            if (num < min) {
                min = num; // Update min if smaller element found
            }
        }
        return min;
    }
}
