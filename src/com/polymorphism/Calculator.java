package com.polymorphism;

//This is an example for compile time polymorphism
public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }
    public int add(int a, int b, int c) {
        return a+b+c;
    }
    public int add(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    public static void main(String arg[]) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2, 3, 4));
        System.out.println(calculator.add(2, 3, 4, 5));
    }
}
