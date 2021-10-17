package com.company.LeetCode;

// https://leetcode.com/problems/find-the-duplicate-number

public class Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int crt = nums[i] - 1;
            if (nums[i] != nums[crt]){
                swap(nums, i, crt);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1){
                return nums[j];
            }
        }

        return -1;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
