
package ArrrayPros;

public class DuplicateElements {

    public static void main(String[] args) {

        int arr[] = new int[] {3,5,6,6,1,5,4,1,4};
        //int[] arr = new int[]{4,4,4,4,4,1};

        System.out.println("Duplicate elements in an array");

        for(int i =0; i<arr.length;i++ ){

            for (int j= i+1; j<arr.length;j++){

                if (arr[i]==arr[j]){
                    System.out.println("Duplicate Element : "+arr[j]);
                }
            }


            }
        }
    }


