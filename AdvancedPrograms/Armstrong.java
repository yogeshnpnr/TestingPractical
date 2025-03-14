public class Armstrong {


    public static void main(String[] args) {

        int number = 371, sum = 0, rem;
        int temp = number;

        while (number > 0) {
            rem = number % 10;// 153%10= 3   15%10= 5
            number = number / 10; //153/10 = 15  15/10 =1
            sum = sum + (rem * rem * rem);// 0+(3*3*3)=27

        }
        if (sum == temp) {
            System.out.println("it is Armstrong number");
        } else {
            System.out.println("it is not Armstrong number");

        }
    }
}