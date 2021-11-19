package com.company.LeetCode;

// https://leetcode.com/problems/first-bad-version/

public class BadVersion {
    public static void main(String[] args) {
        // Please see the problem statement from above link
    }

    static public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int ans = 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (isBadVersion(mid)){ // pre-defined API boolean isBadVersion(int num)
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
