package com.company.LeetCode;

import java.util.*;

// https://leetcode.com/problems/combination-sum/

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    static public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    static public void combinations(int i, int[] candidates, int target, List<List<Integer>> ans, List<Integer> seq) {
        if (i == candidates.length) {
            if (target == 0){
                ans.add(new ArrayList<>(seq));
            }
            return;
        }

        if (candidates[i] <= target) {
            seq.add(candidates[i]);
            combinations(i, candidates, target - candidates[i], ans, seq);
            seq.remove(seq.size() - 1);
        }

        combinations(i + 1, candidates, target, ans, seq);
    }

}
