package ArrrayPros;

public class secondLargest {

    public static void main(String[] args)

    {

        int array[] = { 1, 2, 3, 4, 11, 12, 13, 14, 21, 22, 23, 24, 31, 32};

        int high = 0;

        int nextHigh = 0;

        System.out.println("The given array is:");

        for (int i = 0; i < array.length; i++)

        {

            System.out.println(array[i] + "\t");

        }

        for (int i = 0; i < array.length; i++)

        {

            if (array[i] > high)

            {

                nextHigh = high;

                high = array[i];

            }

            else if (array[i] > nextHigh)

            {

                nextHigh = array[i];

            }

        }

        System.out.println("Second Highest is:" + nextHigh);

        System.out.println("Highest Number is: "  +high);

    }
}
