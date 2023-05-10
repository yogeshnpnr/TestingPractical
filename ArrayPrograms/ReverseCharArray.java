package ArrrayPros;


    import java.util.Arrays;
import java.util.Collections;

    public class ReverseCharArray {

        public static void main(String[] args) {

            char[] letters = {'e', 'v', 'o', 'l', 'e'};

            printReverse(letters,5);

        }

        public static void printReverse(char[] letters, int size){

            for (int i = size-1; i >= 0 ; i--)
            {

                System.out.print(letters[i]);
            }
        }

    }



