package com.teachmeskills.lesson9.homework.task2;


import com.teachmeskills.lesson9.homework.task2.matrix_util.Utils;

public class Runner {
        public static void main(String[] args) {
            int[][] firstMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
            int[][] secondMatrix = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
            int[][] resultMatrix = multiplyMatrices(firstMatrix, secondMatrix);

            Utils.printMatrix(firstMatrix);
            System.out.println();
            Utils.printMatrix(secondMatrix);
            System.out.println();
            Utils.printMatrix(resultMatrix);
        }

        public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
            int firstRows = firstMatrix.length;
            int firstCols = firstMatrix[0].length;
            int secondCols = secondMatrix[0].length;

            int[][] resultMatrix = new int[firstRows][secondCols];

            for (int i = 0; i < firstRows; i++) {
                for (int j = 0; j < secondCols; j++) {
                    for (int k = 0; k < firstCols; k++) {
                        resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                }
            }

            return resultMatrix;
        }
    }