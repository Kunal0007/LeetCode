package com.company.LeetCode;

// https://leetcode.com/problems/missing-number

public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int crt = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[crt]) {
                swap(nums, i, crt);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j){
                return j;
            }
        }

        return nums.length;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
