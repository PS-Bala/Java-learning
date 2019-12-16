package com.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> customers = new HashMap<Integer, String>();
        customers.put(1, "Ram");
        customers.put(null, "Mahesh");
        customers.put(3, null);
        customers.put(4, "Prkash");
        customers.put(4, "Prkash");
        customers.put(8, "Soundar");
        customers.put(5, "Parthi");
        customers.put(6, "Sriram");
        customers.put(7, null);
        System.out.println("Available customers");
        for (Map.Entry customer : customers.entrySet()) {
            System.out.println(customer.getKey() + " " + customer.getValue());
        }
        customers.putIfAbsent(9, "Vijay");
        customers.putIfAbsent(9, "Raghu");
        System.out.println("Put if absent ");
        for (Map.Entry customer : customers.entrySet()) {
            System.out.println(customer.getKey() + " " + customer.getValue());
        }
        System.out.println("Removed null keys");
        customers.remove(null);
        customers.remove(3);
        customers.remove(7);
        for (Map.Entry customer : customers.entrySet()) {
            System.out.println(customer.getKey() + " " + customer.getValue());
        }
        customers.replace(8, "Suman");
        System.out.println("After replace");
        for (Map.Entry customer : customers.entrySet()) {
            System.out.println(customer.getKey() + " " + customer.getValue());
        }
    }
}
