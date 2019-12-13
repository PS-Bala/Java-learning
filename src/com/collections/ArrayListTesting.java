package com.collections;

import java.util.ArrayList;

public class ArrayListTesting {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        System.out.println("Total items : " + fruits.size());
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
