

public class ReverseTest {

    public static void main(String[] args) {


      /*  String inp = "ra-muk-hse-go-y";

        String output ="";

        for (int i = inp.length()-1; i>= 0; i-- ){

            output = output + inp.charAt(i);

           // ra-muk-hse-go-y

            // o/p = yo-ges-hku-ma-r

            System.out.println( "output string is "+output );
           /// o/p = yo-ges-hku-ma-r
        }
*/




        String input = "ra-muk-hse-go-y";

        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        System.out.println("The reversed string is: " + reverse);

    }

}
