public class LongestSubstring {
    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        String longestSubstring = "";
        String currentSubstring = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentSubstring.indexOf(currentChar) == -1) {
                currentSubstring += currentChar;
            } else {
                if (currentSubstring.length() > longestSubstring.length()) {
                    longestSubstring = currentSubstring;
                }

                currentSubstring = currentSubstring.substring(currentSubstring.indexOf(currentChar) + 1) + currentChar;
            }
        }

        if (currentSubstring.length() > longestSubstring.length()) {
            longestSubstring = currentSubstring;
        }

        System.out.println("Longest substring without repetition: " + longestSubstring);
    }
}
