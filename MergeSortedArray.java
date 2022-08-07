package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }

    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0){
            if (nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
            }
            else {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }

        while (i>=0){
            nums1[k] = nums1[i];
            i--;
            k--;
        }

        while (j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
