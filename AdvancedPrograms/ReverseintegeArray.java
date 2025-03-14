import java.util.Arrays;

public class ReverseintegeArray {
    public static void main(String[] args) {
        int arr[]= new int []{3,7,1,9} ;

        System.out.println("size of an Array  "+ arr.length);

        System.out.println(" Array in reverse order");

        for(int i = arr.length-1;i>=0;i--)

            System.out.println(arr[i]+" ");
    }
}
