package com.company.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/sum-of-even-numbers-after-queries/

public class Sumeven {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[][] queries = new int[][]{{1,0}, {-3,1}, {-4,0}, {2,3}};
        System.out.println(Arrays.toString(sumEvenAfterQueries(nums, queries)));
    }

    static public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sume = 0;
        int[] ans = new int[queries.length];
        for(int i: nums){
            if(i % 2 == 0){
                sume += i;
            }
        }
        for(int i = 0; i < queries.length; i++){
            int k = nums[queries[i][1]] + queries[i][0];
            if(nums[queries[i][1]] % 2 == 0) sume -= nums[queries[i][1]];
            if(k%2 == 0){
                nums[queries[i][1]] = k;
                sume += nums[queries[i][1]];
                ans[i] = sume;
            }
            else{
                nums[queries[i][1]] = k;
                ans[i] = sume;
            }
        }
        return ans;
    }

}
