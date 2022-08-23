package com.company.LeetCode;

// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

import java.util.Arrays;

public class GreatestonRight {
    public static void main(String[] args) {
        int[] arr = new int[]{17,18,5,4,6,1};
        System.out.print(Arrays.toString(replaceElements(arr)));
    }

    static public int[] replaceElements(int[] arr) {
        int j = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i]>j){
                int temp = arr[i];
                arr[i] = j;
                j = temp;
                // System.out.print(j + " ");
            }
            else {
                arr[i] = j;
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
