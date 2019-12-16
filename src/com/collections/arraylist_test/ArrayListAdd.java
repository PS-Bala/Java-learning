package com.collections.arraylist_test;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<String> shoppedItems = new ArrayList<String>();
        shoppedItems.add("Tomato");
        shoppedItems.add("Potato");
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add(0,"Apple");
        fruits.add("Orange");
        shoppedItems.addAll(fruits);
        shoppedItems.add(1, "Brinjal");
        for (String item : shoppedItems) {
            System.out.println(item);
        }
    }
}
