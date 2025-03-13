public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "HELLO YOGESH";
        System.out.println("Reversed Words: " + reverseWords(str));
    }

    public static String reverseWords(String str) {
        String result = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (c != ' ') {
                word = c + word; // Build the word in reverse order
            } else {
                result = result +word + " "; // Append reversed word
                word = ""; // Reset for next word
            }
        }
          result = result +word; // Append the last reversed word

        return result;
    }
}
