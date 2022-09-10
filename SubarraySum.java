package com.company.LeetCode;

import java.util.HashMap;

// https://leetcode.com/problems/subarray-sum-equals-k/submissions/

public class SubarraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subarraySum(nums, 5));
    }

    static public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        int ans = 0;
        HashMap<Integer, Integer> ht1 = new HashMap<>();
        ht1.put(0,1);
        for(int i = 0; i < nums.length; i++){
            ans += nums[i];
            if (ht1.containsKey(ans - k))
                cnt += ht1.get(ans - k);
            ht1.put(ans, ht1.getOrDefault(ans, 0) + 1);
        }
        return cnt;
    }
}
