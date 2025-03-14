
public class LargestElementOfIntegerArray {

    public static void main(String[] args) {


        int arr[] = new int[]{55, 33, 66, 104, 40};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("largest element array is   = " + max);


    }
}
