package com.company.LeetCode;

import java.util.*;

// https://leetcode.com/problems/merge-similar-items/

public class MergeSimilarItems {
    public static void main(String[] args) {
        int[][] items1 = {{1, 1}, {4, 5}, {3, 8}};
        int[][] items2 = {{3, 1}, {1, 5}, {7,1}};
        mergeSimilarItems(items1, items2);
    }
//6141. Merge Similar Items
//    6142. Count Number of Bad Pairs
//    6174. Task Scheduler II
//    6144. Minimum Replacements to Sort the Array
    static public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> res = new TreeMap();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < items1.length; i++) {
                res.put(items1[i][0], items1[i][1]);
        }
        for (int i = 0; i < items2.length; i++) {
            if (res.containsKey(items2[i][0])){
                res.put(items2[i][0], res.get(items2[i][0]) + items2[i][1]);
            }
            else {
                res.put(items2[i][0], items2[i][1]);
            }
        }

        for (var a: res.entrySet()) {
            ans.add(Arrays.asList(a.getKey(), a.getValue()));
        }
        System.out.println(ans);
        return ans;
    }
}
