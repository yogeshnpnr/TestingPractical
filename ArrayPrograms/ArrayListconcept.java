package ArrrayPros;

import java.util.ArrayList;

public class ArrayListconcept {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        arr.add("a");
        arr.add(1);
        arr.add("wdw");
        arr.add(123.33);


        System.out.println(arr.size());
        System.out.println(arr.get(3));

        for(int i= 0 ;i<arr.size(); i++){

            System.out.println(arr.get(i));
        }

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(3);

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("qq");
        a2.add("3dq");


    }
}
