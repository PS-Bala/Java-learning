package com.bk.utilities;

public class Prime {
    public static boolean isPrime(final long number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}