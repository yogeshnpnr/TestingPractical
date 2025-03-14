public class ConsecutiveCharacters {

   public static void main(String[] args) {
        String input = "abbcddeff";
        findConsecutiveChars(input);
    }
  
    public static void findConsecutiveChars(String str) {
        int n = str.length();

        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                System.out.println("Consecutive chars: " + str.charAt(i) + str.charAt(i + 1) + " at index " + i);
            }
        }
    }

   
}
