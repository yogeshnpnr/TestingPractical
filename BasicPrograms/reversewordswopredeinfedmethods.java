public class ReverseWords {
    public static void main(String[] args) {
        String inputString = "this is my cat";
        String outputString = reverseWords(inputString);
        System.out.println("Output - " + outputString);
    }

    public static String reverseWords(String inputString) {
        StringBuilder reversedString = new StringBuilder();
        StringBuilder wordBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c != ' ') {
                wordBuilder.append(c);
            } else {
                reversedString.append(reverseWord(wordBuilder.toString()));
                reversedString.append(" ");
                wordBuilder.setLength(0);
            }
        }

        // Reverse the last word
        reversedString.append(reverseWord(wordBuilder.toString()));

        return reversedString.toString();
    }

    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }
}
/////////////////


In the code above, the reverseWords() method iterates
  through each character in the input string. 
  If the character is not a space, it is added to
  the wordBuilder StringBuilder. 
  When a space is encountered, it means that a word has ended,
  so the reverseWord() 
  method is called to reverse the word and append it to 
  the reversedString StringBuilder,
  along with a space. Finally, after the loop, 
  the last word is reversed and appended to the reversedString. 
  The reverseWord() method reverses a word by iterating through 
  each character in reverse order and appending it to a new StringBuilder.
















