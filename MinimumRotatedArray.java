package com.company.LeetCode;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class MinimumRotatedArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,6,7};
        System.out.println(findMin(nums));
    }

    static public int findMin(int[] nums) {
        int ans = findpeak(nums) + 1;
        return nums[ans];
    }

    static int findpeak(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if (nums[mid] <= nums[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
