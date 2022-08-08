package com.company.LeetCode;

import java.util.HashMap;

// https://leetcode.com/problems/majority-element/

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }

    static public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
//            System.out.println(map);
            int count = map.getOrDefault(nums[i], 0);
            if (map.containsKey(nums[i]) || count == 0){
                count++;
                map.put(nums[i], count);
            }
            if (count > nums.length/2){
                return nums[i];
            }
        }

        return 0;
    }
}
