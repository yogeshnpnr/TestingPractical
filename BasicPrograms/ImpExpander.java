public class ImpExpander {

    public static void main(String[] args) {
        String input = "3[a]2[bc]";
        String output = expandString(input);
        System.out.println(output); // prints "aaabcbc"
    }

    public static String expandString(String input) {
        StringBuilder output = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            if (Character.isDigit(input.charAt(i))) {
                int count = 0;
                while (Character.isDigit(input.charAt(i))) {
                    count = count * 10 + Character.getNumericValue(input.charAt(i));
                    i++;
                }
                i++; // skip the opening bracket
                int j = input.indexOf("]", i);
                String subString = input.substring(i, j);
                for (int k = 0; k < count; k++) {
                    output.append(subString);
                }
                i = j + 1; // skip the closing bracket
            } else {
                output.append(input.charAt(i));
                i++;
            }
        }
        return output.toString();
    }
}
