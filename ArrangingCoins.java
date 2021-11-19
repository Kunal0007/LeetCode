package com.company.LeetCode;

// https://leetcode.com/problems/arranging-coins/

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(254));
    }

    static public int arrangeCoins(int n) {
        int i = 1;
        int com = 0;
        while (n >= i){
            n -= i;
            i++;
            com++;
        }
        return com;
    }
}
