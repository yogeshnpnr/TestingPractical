public class FindSpecialChars  {
    public static void findSpecialChars(String str) {
        System.out.print("Special characters: ");
        for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                System.out.print(ch + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "Hello, World! #2025@";
        findSpecialChars(str);
    }
}
