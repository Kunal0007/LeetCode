package com.company.LeetCode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/spiral-matrix/

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 7}, {5, 6, 7, 8, 9}, {9, 10, 11, 12, 0}};
        System.out.println(spiralOrder(matrix));
    }

    static public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int t = 0;
        int b = matrix.length - 1;
        int r = matrix[0].length - 1;
        int l = 0;
        while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) {
                ans.add(matrix[t][i]);
            }
            t++;
            for (int j = t; j <= b; j++) {
                ans.add(matrix[j][r]);
            }
            r--;
            if (t <= b){
                for (int k = r; k >= l; k--) {
                    ans.add(matrix[b][k]);
                }
            }
            b--;
            if (l <= r){
                for (int n = b; n >= t; n--) {
                    ans.add(matrix[n][l]);
                }
            }
            l++;
        }

//        if (matrix.length % 2 == 1){
//            ans.remove(ans.size() - 1);
//        }
        return ans;
    }
}
