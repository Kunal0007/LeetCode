package com.company.LeetCode;

import java.util.*;

// https://leetcode.com/problems/3sum/

public class Three_sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
        if (nums.length < 3){
            return new ArrayList<>(list);
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end){
                int sum = nums[start] + nums[end];
                if(sum < target){
                    start++;
                }
                else if(sum > target){
                    end--;
                }
                else{
                    list.add(List.of(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                }
            }
        }
        return new ArrayList<>(list);
    }
}
