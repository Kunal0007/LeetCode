package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/

public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }

    static public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
