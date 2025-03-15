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



1.The program iterates through the string and checks if adjacent characters are the same.
2.When a consecutive character pair is found, it prints the pair and skips the entire sequence using a while loop.
3.This ensures each consecutive character sequence is printed only once, avoiding duplicate prints. ✅
