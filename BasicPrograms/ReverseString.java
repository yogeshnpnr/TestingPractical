public class ReverseString {


    public static void main(String[] args) {

        String str = "Swiggy";

        //StringBuffer sb = new StringBuffer(str);
        //String result7 = sb.reverse().toString();

      //  System.out.println(result7);

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }

        System.out.println(result);

        // j= i+1
        // i>=0


    }
}


