package ArrrayPros;

public class copyelementsofArray {

    public static void main(String[] args) {

        int arr1[] = new int[]{1,3,5,9};
        int arr2[] =new int[arr1.length];
        for(int i = 0; i<arr1.length;i++){
            arr2[i]=  arr1[i];
        }
        System.out.println("Display elements of second array");

        for (int i=0; i<arr2.length;i++){

            System.out.print(arr2[i]+"  ");


        }


    }
}
