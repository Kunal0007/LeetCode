package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/flipping-an-image

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    static public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;
        for (int[] img : image) {
            for (int i = 0; i < (n + 1) / 2; i++) {
                int temp = img[i];
                img[i] = img[n - i - 1] ^ 1;
                img[n - i - 1] = temp ^ 1;
            }
        }

        return image;
    }
}
