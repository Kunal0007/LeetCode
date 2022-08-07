package com.company.LeetCode;

import java.util.HashMap;

public class BadPairs {
    public static void main(String[] args) {
        System.out.println(countBadPairs(new int[]{4,1,3,3,5}));
    }

    static public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        int l = nums.length;
        long count = 0;
        for (int i = 0; i < l; i++) {
            int key = i - nums[i] ;
            int val = ans.getOrDefault(key, 0);
            count += val;
            ans.put(key, val + 1);
        }
        return 1L*l*(l-1)/2 - count;
    }
}
