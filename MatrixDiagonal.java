package com.company.LeetCode;

// https://leetcode.com/problems/matrix-diagonal-sum

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println(diagonalSum(mat));
    }

    static public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j || i == mat.length - 1 - j){
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }
}
