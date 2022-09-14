package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/next-permutation/

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        nextPermutation(nums);
    }

    static public void nextPermutation(int[] nums) {
        int largestI = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]){
                largestI = i;
            }
        }

        if (largestI == -1){
            for (int i = 0; i < nums.length / 2; i++) {
                int t = nums[i];
                nums[i] = nums[nums.length - i - 1];
                nums[nums.length - i - 1] = t;
            }
            System.out.println(Arrays.toString(nums));
            return;
        }

        int largestJ = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[largestI] < nums[j]){
                largestJ = j;
            }
        }

        int temp = nums[largestI];
        nums[largestI] = nums[largestJ];
        nums[largestJ] = temp;

        int start = largestI + 1;
        int end = nums.length - 1;

        while(start < end){
            int t = nums[start];
            nums[start++] = nums[end];
            nums[end--] = t;
        }

        System.out.println(Arrays.toString(nums));
    }
}
