package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/shuffle-the-array

public class Shuffle_Array {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        int n = 2;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    static public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int x = 0;
        int y = n;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0){
                ans[i] = nums[x];
                x += 1;
            }
            else {
                ans[i] = nums[y];
                y += 1;
            }
        }
        return ans;
    }
}
