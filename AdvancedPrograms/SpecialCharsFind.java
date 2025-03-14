public class SpecialCharsFind {
    public static void main(String[] args) {
        String str = "Hello@World#2024!";
        System.out.print("Special Characters: ");

        for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.print(ch + " ");
            }
        }
    }
}
