package com.bk;
import MathFunction.Prime;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number to check is this prime or not");
        //Enter data using BufferReader
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        // Reading data using readLine
        String valString = reader.readLine();
        int value = Integer.parseInt(valString);
        System.out.print(Prime.isPrime(value) ? "Prime" : "Not Prime");
    }
}
