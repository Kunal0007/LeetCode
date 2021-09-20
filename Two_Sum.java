package com.company.LeetCode;

// https://leetcode.com/problems/two-sum/

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = new int[]{3,3};
        int[] index = new int[2];
        int target = 9;
        for (int i = 0; i<arr.length; i++){
            for (int j = i + 1; j<arr.length; j++){
                if (arr[i] + arr[j] == 6){
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(index));
    }
}
