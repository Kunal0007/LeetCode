package com.company.LeetCode;

import java.util.ArrayList;

import java.util.List;

// https://leetcode.com/problems/add-to-array-form-of-integer

public class ArrayForm_Integer {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        System.out.println(addToArrayForm(num, 806));
    }

    static public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0){
            if (i >=0){
                ans.add(0, (num[i] + k) % 10);
                k = (num[i] + k) / 10;
                i--;
            }
            else {
                ans.add(0, k % 10);
                k /= 10;
            }
        }
        return ans;
    }
}
