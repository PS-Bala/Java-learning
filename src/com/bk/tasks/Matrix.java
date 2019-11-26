package com.bk.tasks;

public class Matrix {
    int[][] value1;
    int[][] value2;
    public Matrix(int[][] value1, int[][] value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public int[][] addTwoMatrix() {
        int rowLength = value1.length;
        int colLength =  value1[0].length;
        int[][] output = new int[rowLength][colLength];
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                output[row][col] = value1[row][col] +value2[row][col];
            }
        }
        return output;
    }

    public void printMatrix(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength =  matrix[0].length;
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                System.out.print(matrix[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
