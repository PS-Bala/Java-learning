package com.collections.arraylist_test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRetain {
    public static void main(String[] args) {
        ArrayList<String> customers = new ArrayList<String>(Arrays.asList("Bala", "Ram", "Mohan", "Praven"));
        ArrayList<String> newCustomers = new ArrayList<String>(Arrays.asList("Bala", "Ashok", "Pirama", "Sujith"));
        customers.retainAll(newCustomers);
        System.out.println("Common elements");
        for (String customer : customers) {
            System.out.println(customer);
        }
        customers.replaceAll(e -> e.toUpperCase());
        System.out.println("Convert into upper case");
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}
