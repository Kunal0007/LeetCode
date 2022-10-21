package com.company.LeetCode;

import java.util.*;

// https://leetcode.com/problems/contains-duplicate-ii/

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }

    static public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) return true;
            map.put(nums[i], i);
        }

        return false;
    }
}
