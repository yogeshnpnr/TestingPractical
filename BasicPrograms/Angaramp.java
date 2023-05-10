import java.util.Arrays;

public class Angaramp {

    public static void main(String []args ){

        String str1 = "tops";
        String str2 = "stop";


       // String str = "army";
        //String str2 ="mary";

        char[] arr = str1.toLowerCase().toCharArray();
        char[] arr2= str2.toLowerCase().toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        if(Arrays.equals(arr,arr2)){
            System.out.println("they are anagram");
        } else{
            System.out.println("they are not");
        }


//
//        char[] arr3 = str1.toLowerCase().toCharArray();
//        char[] arr4 =str2.toLowerCase().toCharArray();
//
//        Arrays.sort(arr3);
//        Arrays.sort(arr4);
//
//        if (Arrays.equals(arr3,arr4)){
//            System.out.println("they are anagram");
//        } else{
//            System.out.println("they are not");
//
//        }


    }


    }

