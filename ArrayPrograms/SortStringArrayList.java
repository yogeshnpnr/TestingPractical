package ArrrayPros;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringArrayList {

    public static void main(String args[]){

        /*Creating String ArrayList Object*/

        ArrayList<String> countrieslist = new ArrayList<String>();
        countrieslist.add("USA");
        countrieslist.add("UK");
        countrieslist.add("India");
        countrieslist.add("Canada");



        /*Unsorted Countries List*/
        System.out.println("Countries List Before Sorting:");
        for(String counter: countrieslist){
            System.out.println(counter);
        }

    /* Sort ArrayList using

       Collections.sort(list) method*/
        Collections.sort(countrieslist);

        /* Sorted Countries List*/
        System.out.println("Countries List After Sorting:");
        for(String counter: countrieslist){
            System.out.println(counter);
        }
    }
}
