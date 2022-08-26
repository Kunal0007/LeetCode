package com.company.LeetCode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(solve(5));
    }

    private static List<List<Integer>> solve(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i){
                    l.add(1);
                }
                else {
                    l.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(l);
        }
        return list;
    }
}
