public class PalindromProggam {

    public static void main(String[] args) {
        int rem, sum = 0, temp;
        int num = 1234;
        temp = num;
        while (num > 0) {

            rem = num % 10;
            num = num / 10;
            sum = (sum * 10) + rem;

        }

        System.out.println(sum);

        if (temp == sum) {

            System.out.println("it is palindrome number");

        } else {
            System.out.println(" it is not palindrome number");

        }
    }


}
