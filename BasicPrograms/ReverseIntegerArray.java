import java.util.Arrays;
public class ReverseIntegerArray {
    public static void main(String[] args) {
        int [] arr = new int[]{3,1,2,6};
        System.out.println(arr.length);

        System.out.println("Array in reverse order");
        for(int i = arr.length-1;i>=0;i--)

            System.out.println(arr[i]+"");


    }
}
