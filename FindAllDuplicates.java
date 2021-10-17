package com.company.LeetCode;

import java.util.ArrayList;

import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    static List<Integer> findDuplicates(int[] nums) {
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

        List<Integer> ans = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1){
                ans.add(nums[j]);
            }
        }

        return ans;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
