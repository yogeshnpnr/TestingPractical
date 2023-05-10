public class Test {



   /* input: s = "3[a]2[bc]"


    Output: "aaabcbc"


    Input: s = "3[a2[c]]"

    Output: "accaccacc"*/




    public static void main(String[] args) {


        String a = "3[a]2[bc]";

        String b = "3[a2[c]]";

        String strone ="";

        String strtwo ="";


        for (int i  = 0 ; i <a.length();i ++){



            if (i > 48  && i < 68 ){


                strone = String.valueOf(3 * a.charAt(i));


            }


            System.out.println(strone+"testing yogesh");
        }




    }
}
