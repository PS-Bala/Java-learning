package com.arguments;

public class VariableLengthArgsTest {
    private static int add(int... values) {
        int total = 0;
        for (int value: values) {
            total += value;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(add(3,4,5));
        System.out.println(add(3,4,5,6));
    }
}
