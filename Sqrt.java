package com.company.LeetCode;

// https://leetcode.com/problems/sqrtx/

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(0));
    }

    static public int mySqrt(int x) {
        int start = 0;
        int end = x;
        while (start <= end){
            int mid = start + (end - start)/2;
            long temp = (long)mid * (long)mid;
            if (temp == x){
                return mid;
            }
            if (temp > x){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start - 1;
    }
}
