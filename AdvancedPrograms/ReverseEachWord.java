// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ReverseEachWord {
    public static void main(String[] args) {
        
        String str = "HELLO YOGESH";
       String[] words = str.split(" ");
       String result = "";
       
       
    for (String word : words) {
            result =result+ reverseString(word) + " ";
        }

    // Method to reverse a string manually
    public static String reverseString(String word) {
        char[] chars = word.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed = reversed+chars[i];
          
        }
        return reversed;
    }
}
