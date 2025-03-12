public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "HELLO YOGESH";
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            result += reverseString(word) + " ";
        }

        System.out.println("Reversed words: " + result.trim());
    }

    // Method to reverse a string manually
    public static String reverseString(String word) {
        char[] chars = word.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }
}
