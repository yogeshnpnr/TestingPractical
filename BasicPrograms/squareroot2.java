import java.util.Scanner;

public class squareroot2 {



    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Input a number to find square root: ");

            double square = sc.nextDouble();            double squareRoot = Math.sqrt(square);

            System.out.printf("The square root is: %f ", squareRoot);

        }

    }
}
