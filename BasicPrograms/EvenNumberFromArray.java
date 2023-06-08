package TestandLearn;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberFromArray {


    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        int sum =0;

        for(int number :numbers){
            if(number%2==0){
                sum +=number;
            }
        }

        System.out.println("even numbers sum " +sum);
    }
}
