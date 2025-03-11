public class ReverseWordsSimple {

    public static String reverseWords(String input) {
        if (input == null || input.isEmpty()) {
            return "Input is empty or null";
        }

        String[] words = input.trim().split("\\s+"); // Split words, ignoring extra spaces
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(reverseString(words[i])); // Reverse each word
            if (i < words.length - 1) {
                result.append(" "); // Add space between words
            }
        }

        return result.toString();
    }

    private static String reverseString(String word) {
        char[] letters = word.toCharArray(); // Convert word to character array
        int start = 0;                       
        int end = letters.length - 1;        

        while (start < end) {  // Swap characters until pointers meet in the middle
            char temp = letters[start];   
            letters[start] = letters[end]; 
            letters[end] = temp;          

            start++;  // Move start forward
            end--;    // Move end backward
        }

        return new String(letters); // Convert character array back to a string
    }

    public static void main(String[] args) {
        String input = "hello world yogesh";
        System.out.println("Output: " + reverseWords(input));

        // Test cases
        System.out.println(reverseWords("this is simple"));    // "siht si elpmis"
        System.out.println(reverseWords("   extra spaces   "));// "artxe secaps"
        System.out.println(reverseWords("a b c"));            // "a b c"
        System.out.println(reverseWords(""));                 // "Input is empty or null"
        System.out.println(reverseWords(null));               // "Input is empty or null"
    }
}

