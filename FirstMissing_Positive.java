package com.company.LeetCode;

// https://leetcode.com/problems/first-missing-positive

public class FirstMissing_Positive {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int crt = nums[i] - 1;
            if (nums[i] > 0 &&  nums[i] <= nums.length && nums[i] != nums[crt]){
                swap(nums, i, crt);
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
