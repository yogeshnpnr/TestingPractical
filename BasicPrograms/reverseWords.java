public class revsWords {
//if Input  is - "this is my cat"
//output should be "Output - siht si ym tac"

    public static String reverseWords(String input) {
        String[] words = input.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder(word);
            wordBuilder.reverse();
            reversed.append(wordBuilder).append(" ");
        }

        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String input = "this is my cat";
        String output = reverseWords(input);
        System.out.println("Output - " + output);
    }
}

