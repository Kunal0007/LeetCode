package com.company.LeetCode;
import java.util.*;

// https://leetcode.com/problems/3sum-closest/

public class ThreeSumC {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    static public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[nums.length - 1];

        for (int i = 0; i < nums.length - 2; i++){
            int start = i+ 1;
            int end = nums.length - 1;

            while (start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if (sum > target) end--;
                else start++;

                if (Math.abs(target - sum) <= Math.abs(target - ans))
                    ans = sum;
            }
        }
        return ans;
    }
}
