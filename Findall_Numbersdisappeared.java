package com.company.LeetCode;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

import java.util.ArrayList;

import java.util.List;

public class Findall_Numbersdisappeared {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(nums);
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
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
                ans.add(j + 1);
            }
        }

        System.out.println(ans);
        return ans;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }


}
