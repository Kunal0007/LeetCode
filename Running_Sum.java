package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array

public class Running_Sum {
    public static void main(String[] args) {
        int[] arr = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
