package com.company.LeetCode;

import java.util.*;

// https://leetcode.com/problems/combination-sum-ii/

public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        combinations(0, candidates, target, list, new ArrayList<>());
        System.out.println(list);
    }

    static public void combinations(int i, int[] candidates, int target, List<List<Integer>> list, List<Integer> seq)
    {
        if (target == 0){
            list.add(new ArrayList<>(seq));
            // System.out.println(seq);
            return;
        }

        for(int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) continue;
            if (candidates[j] > target) break;

            seq.add(candidates[j]);
            combinations(j + 1, candidates, target - candidates[j], list, seq);
            seq.remove(seq.size() - 1);
        }

    }
}

