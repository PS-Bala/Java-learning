package com.oop;

class Recursion {
    public int factorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return (number * factorial(number - 1));
        }
    }
}

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int output = recursion.factorial(5);
        System.out.println(output);
    }
}
