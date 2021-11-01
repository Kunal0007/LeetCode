package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/build-array-from-permutation

public class Array_Permutation {
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    static public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
