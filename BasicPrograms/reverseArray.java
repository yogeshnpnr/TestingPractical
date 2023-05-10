import java.util.Arrays;

public class reverseArray {




    public static void main(String[] args) {

        int arr[] = new int[] { 40,10,25,30,35,30 };


        System.out.println(arr.length );


        for (int i =arr.length-1 ; i>=0; i--){

            System.out.println(  +arr[i]+ " test ");

            Arrays.stream(arr).sorted();

        }




    }
}
