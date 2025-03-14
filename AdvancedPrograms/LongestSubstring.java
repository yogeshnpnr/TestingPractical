import java.util.HashSet;

public class LongestSubstring {
    public static int findLongestSubstring(String str) {
        int left = 0, maxLength = 0;
        HashSet<Character> uniqueChars = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {
            while (uniqueChars.contains(str.charAt(right))) {
                uniqueChars.remove(str.charAt(left));
                left++;
            }
            uniqueChars.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Longest Substring Length: " + findLongestSubstring(str));
    }
}
//Longest Substring Length: 3
