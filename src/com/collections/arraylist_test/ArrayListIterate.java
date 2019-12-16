package com.collections.arraylist_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterate {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        System.out.println("Total items : " + fruits.size());

//        ---------- Iterate the elements of collection ---------

//        using for of loop
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

//        Using for loop
//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.println(fruits.get(i));
//        }

//        Using for-each loop
//        fruits.forEach(fruit -> {
//            System.out.println(fruit);
//        });

//        Using iterator
//        Iterator ite = fruits.iterator();
//        while (ite.hasNext()) {
//            System.out.println(ite.next());
//        }

//        Using list iterator
//        ListIterator listIterator = fruits.listIterator(fruits.size());
//        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous());
//        }

//        For each remaining
        Iterator iterator = fruits.iterator();
        iterator.forEachRemaining(fruit->{
            System.out.println(fruit);
        });

//        ---------------------

    }
}
