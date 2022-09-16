package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-image/

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(matrix);
    }

    static public void rotate(int[][] matrix) {
        int start = 0, end = matrix.length - 1;
        while (start < end){
            int[] temp = matrix[start];
            matrix[start++] = matrix[end];
            matrix[end--] = temp;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
