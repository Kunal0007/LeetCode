package com.company.LeetCode;

// https://leetcode.com/problems/find-in-mountain-array/

public class FindIn_MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        int peak = findPeakElement(arr);
        int ans = orderagnosticBs(arr, target, 0, peak);
        if(ans != -1){
            return ans;
        }
        return orderagnosticBs(arr, target, peak, arr.length- 1);
    }

    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;

            if (nums[mid] > nums[mid + 1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start; // or end because end == start
    }

    static int orderagnosticBs(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid =  start + (end  - start) / 2 ;

            if (target == arr[mid]){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
