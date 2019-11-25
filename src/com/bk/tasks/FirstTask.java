package com.bk.tasks;

import com.bk.utilities.Prime;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * FirstTask
 */
public class FirstTask {
    public static void controlStatements() throws IOException {
        System.out.println("Enter a number to check is this prime or not");
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Reading data using readLine
        String valString = reader.readLine();
        int value = Integer.parseInt(valString);
        System.out.print(Prime.isPrime(value) ? "Prime" : "Not Prime");
    }
    public static void automaticTypeConversion() {
        int i = 100;
        // automatic type conversion
        long l = i;
        // automatic type conversion
        float f = l;
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);
    }
    public static void explicitTypeConversion(){
        double d = 435.04;
        //explicit type casting
        long l = (long)d;
        //explicit type casting
        int i = (int)l;
        System.out.println("Double value "+d);
        //fractional part lost
        System.out.println("Long value "+l);
        //fractional part lost
        System.out.println("Int value "+i);
    }
}