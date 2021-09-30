package com.company.LeetCode;

// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class Rotated_SortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int peak = findPeak(nums);

        if (peak == -1){
            return binarysearch(nums, target, 0, nums.length - 1);
        }

        if(nums[peak] == target){
            return peak;
        }
        if(target >= nums[0]){
            return binarysearch(nums, target, 0, peak - 1);
        }

        return binarysearch(nums, target, peak + 1, nums.length - 1);

    }

    static int findPeak(int[] nums){
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
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return  -1;
    }

    static int binarysearch(int[] arr, int target, int start, int end) {

        while (start <= end){
            int mid =  start + (end  - start) / 2 ;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
