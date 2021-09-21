package com.company.LeetCode;

// https://leetcode.com/problems/richest-customer-wealth/

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println(maxwealth(accounts));
    }

    private static int maxwealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int i : account) {
                wealth = wealth + i;
            }
            if (wealth > max) {
                max = wealth;
            }
        }
        return max;
    }
}
