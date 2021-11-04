package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/flipping-an-image

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    static public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][n - j - 1];
                image[i][n - j - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (image[i][j] == 0){
                    image[i][j] = 1;
                }
                else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
