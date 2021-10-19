package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
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
            if(nums[j] != j + 1){
                return new int[]{nums[j], j + 1};
            }
        }

        return new int[]{-1, -1};
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
