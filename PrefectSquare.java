package com.company.LeetCode;

// https://leetcode.com/problems/valid-perfect-square/

public class PrefectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    static public boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;
        while (start <= end){
            int mid = start + (end - start)/2;
            long temp = (long)mid * (long)mid;
            if (temp == num){
                return true;
            }
            if (temp > num){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}
