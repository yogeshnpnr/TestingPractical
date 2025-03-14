public class PairSumBruteForce {
    public static void findPairs(int[] arr, int target) {
        int n = arr.length;
        System.out.println("Pairs with sum " + target + ":");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        findPairs(arr, 8);
    }
}
