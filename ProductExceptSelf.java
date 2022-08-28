package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/product-of-array-except-self/

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    static public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int zcnt = 0;
        int pro = 1;
        for (int num : nums) {
            if (num == 0) {
                zcnt++;
            } else {
                pro *= num;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0 && zcnt == 1){
                ans[i] = 0;
            }
            else if(nums[i] == 0 && zcnt == 1){
                ans[i] = pro;
            }
            else if(zcnt > 1){
                ans[i] = 0;
            }
            else {
                ans[i] = pro/nums[i];
            }
        }
        return ans;
    }
}
