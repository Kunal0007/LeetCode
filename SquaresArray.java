package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/

public class SquaresArray {
    public static void main(String[] args) {
        int[] arr = new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    static public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0, j = nums.length - 1;
        for(int k = nums.length - 1; k>=0; k--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                ans[k] = nums[i]*nums[i];
                i++;
            }
            else {
                ans[k] = nums[j]*nums[j];
                j--;
            }
        }
        return ans;
    }
}
