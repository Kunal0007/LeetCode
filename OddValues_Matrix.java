package com.company.LeetCode;

// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix

public class OddValues_Matrix {
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int[][] indices = {
                {1, 1}, {0, 0}
        };
        System.out.println(oddCells(m, n, indices));
    }

    static public int oddCells(int m, int n, int[][] indices) {
        int ans = 0;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }

        for (int[] indice: indices) {
            for (int i = 0; i < n; i++) {
                arr[indice[0]][i] += 1;
            }
            for (int i = 0; i < m; i++) {
                arr[i][indice[1]] += 1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 != 0){
                    ans++;
                };
            }
        }

        return ans;
    }
}
