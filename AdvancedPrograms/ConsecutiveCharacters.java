public class ConsecutiveCharacters {
    public static void main(String[] args) {
        String input = "aabcfffdjkloo";
        findConsecutiveChars(input);
    }

    public static void findConsecutiveChars(String str) {
        int n = str.length();

        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                System.out.println("Consecutive chars: " + str.charAt(i) + str.charAt(i + 1));

                // Skip over the entire consecutive sequence
                while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    i++;
                }
            }
        }
    }
}
