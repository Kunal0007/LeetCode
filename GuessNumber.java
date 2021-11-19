package com.company.LeetCode;

// https://leetcode.com/problems/guess-number-higher-or-lower/

public class GuessNumber {
    public static void main(String[] args) {
        // Please see the problem statement from above link
    }

    static public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (guess(mid) == 0){ // pre-defined API int guess(int num)
                return mid;
            }
            if (guess(mid) > 0){ // pre-defined API int guess(int num)
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
