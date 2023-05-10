package ArrrayPros;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeduplicates {

    public static void main(String args[]) {

        List<Integer> num = new ArrayList<Integer>();

        num.add(1);

        num.add(2);

        num.add(3);

        num.add(4);

        num.add(5);

        num.add(6);

        num.add(3);

        num.add(4);

        num.add(5);

        num.add(6);

        System.out.println("Your list of elements in ArrayList : " + num);

        Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(num);

        num.clear();

        num.addAll(primesWithoutDuplicates);

        System.out.println("list of original numbers without duplication: " + num);

    }
}
