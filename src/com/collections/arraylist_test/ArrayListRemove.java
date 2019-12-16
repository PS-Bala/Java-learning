package com.collections.arraylist_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> customers = new ArrayList<String>(Arrays.asList("Bala", "Ram", "Mohan", "Praven"));
        System.out.println("Available items");
        for (String customer : customers) {
            System.out.println(customer);
        }
//        Remove bala from list
        customers.remove("Bala");
//        Remove last item
        customers.remove(customers.size()-1);
        System.out.println("Available items after removed");
        for (String customer : customers) {
            System.out.println(customer);
        }
        ArrayList<String> newCustomers = new ArrayList<String>();
        newCustomers.add("Raj");
        newCustomers.add("Sujith");
        newCustomers.add("Ashok");
        customers.addAll(newCustomers);
        System.out.println("After added new customers");
        for (String customer: customers) {
            System.out.println(customer);
        }
        customers.removeIf(name -> name == "Raj");
        System.out.println("After invokimg removeIf");
        for (String customer: customers) {
            System.out.println(customer);
        }
        customers.removeAll(newCustomers);
        System.out.println("After invoking removeAll");
        for (String customer: customers) {
            System.out.println(customer);
        }
        customers.clear();
        System.out.println("Invoking after clear() : "+customers);
    }
}
