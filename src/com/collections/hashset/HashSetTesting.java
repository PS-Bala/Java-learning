package com.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTesting {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("PineApple");
        System.out.println("Display items");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Add All");
        HashSet<String> newFruits = new HashSet<String>();
        newFruits.add("Papya");
        newFruits.add("Cherry");
        fruits.addAll(newFruits);
        System.out.println("After adding new items");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits.removeIf(item -> item == "Papaya");
        System.out.println("After invoking removeIf");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits.removeAll(newFruits);
        System.out.println("After invoking removeAll");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits.clear();
        System.out.println("After clear()");
        System.out.println(fruits);

//      Hashset from another location
        ArrayList<String> vegetables = new ArrayList<String>();
        vegetables.add("Onion");
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Brinjal");
        HashSet<String> vegCopy = new HashSet<String>(vegetables);
        System.out.println("Hsahset from another lovation");
        for (String veg : vegCopy) {
            System.out.println(veg);
        }
    }
}
