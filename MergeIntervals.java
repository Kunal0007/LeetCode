package com.company.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/merge-intervals/

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{7, 9}, {4, 6}, {8, 10}, {15, 18}};
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
//        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(merge(arr)));
    }

    static public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{intervals[0][0], intervals[0][1]});
        int j = 0;
        for(int i = 1; i<intervals.length; i++){
            if(list.get(j)[1] >= intervals[i][0]){
                list.get(j)[1] = Math.max(intervals[i][1], list.get(j)[1]);
            }
            else {
                list.add(new int[]{intervals[i][0], intervals[i][1]});
                j++;
            }
        }
        int[][] ints;
        ints = list.toArray(new int[list.size()][]);
        return ints;
    }
}
