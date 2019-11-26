package com.bk;

import com.bk.tasks.Matrix;
import com.bk.tasks.SecondTask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        First task
    //        FirstTask.controlStatements();
    //        FirstTask.automaticTypeConversion();
    //        FirstTask.explicitTypeConversion();
//        Second task
    //        Find MAX value of the array
        //        int maxValue = SecondTask.findMaxValueInArray(new int[]{10, 45, 35, 89, 43, 21});
        //        System.out.print("Maximum value of \"10, 45, 35, 89, 43, 21\" array is : ");
        //        System.out.println(maxValue);
     //       Add two multi dimension array
                int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}};
                int[][] secondMatrix = {{0, 2, 1}, {-1, 0, -3}};
                Matrix matrix = new Matrix(firstMatrix, secondMatrix);
                int[][] output = matrix.addTwoMatrix();
                matrix.printMatrix(output);
    }
}
