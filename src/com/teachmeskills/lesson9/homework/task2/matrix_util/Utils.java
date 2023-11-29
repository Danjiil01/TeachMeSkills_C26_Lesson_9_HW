package com.teachmeskills.lesson9.homework.task2.matrix_util;

public class Utils {
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix){
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
