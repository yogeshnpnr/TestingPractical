public class ConsecutiveCharacters {
    public static void main(String[] args) {
        String input = "aabcfffdjkloo";
        findConsecutiveChars(input);
    }

    public static void findConsecutiveChars(String str) {
        
//This method is responsible for detecting consecutive repeating characters in the given string.
  
        int n = str.length();


//Loops through the string from index 0 to n-2, checking each character and its next one.
//If the current character is equal to the next character, it means a repetition is found.

            for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                
         //Prints the detected consecutive characters.

    System.out.println("Consecutive chars: " + str.charAt(i) + str.charAt(i + 1));

//This inner loop ensures that once a sequence of repeating characters is found, it skips over the entire sequence.
//Prevents printing the same character multiple times for longer sequences.
// Skip over the entire consecutive sequence

                while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    i++;
                }
            }
        }
    }
}
