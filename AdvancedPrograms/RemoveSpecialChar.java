public class RemoveSpecialChar {


        public static void main(String args[])
        {
            String str = "Hello+-^Java+ -Programmer^ ^^-- ^^^ +!";
            str = str.replaceAll("[-+^]*", "");
//str=str.replaceAll("\\W", " ")    //we can also use this regular expression
            System.out.println(str);
        }




    }
