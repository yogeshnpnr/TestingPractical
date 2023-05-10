public class countOccurenceofChars {

    public static void main(String args[]){


       String str = "i love java programming language";


       int result = str.length()-str.replaceAll("r","").length();

        System.out.println("count of r"+result);

        int result1= str.length()-str.replaceAll("g","").length();
        System.out.println("count of u=  "+result1);

    }
}
