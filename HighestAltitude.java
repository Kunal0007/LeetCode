package com.company.LeetCode;

// https://leetcode.com/problems/find-the-highest-altitude

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }

    static public int largestAltitude(int[] gain) {
        int ans = 0;
        int altitude = 0;
        for (int altitudegain : gain) {
            altitude += altitudegain;
            if (altitude >= ans) {
                ans = altitude;
            }
        }
        return ans;
    }
}
