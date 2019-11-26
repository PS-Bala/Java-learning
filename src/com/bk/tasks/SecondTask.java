package com.bk.tasks;

import java.lang.reflect.Constructor;

public class SecondTask {
    public static int findMaxValueInArray(int[] values) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
