package ArrrayPros;

import java.util.Arrays;

public class sortIntegerArray {
    public static void main(String[] args) {
        int[] array = {3, 10, 15, 20, 1, 5, 17, 30, 29};

        // Sorting the array using bubble sort
        bubbleSort(array);

        // Printing the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swapping elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}

