package ArrrayPros;

public class MinElementofArray {
    public static void main(String[] args) {

        int arr[] = new int[]{13,45,11,33};

        int min= arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i]<min)
            {

                min= arr[i];
            }
        }

        System.out.println("min element of array   = "+min


        );
    }

}
