package com.company.LeetCode;

// https://leetcode.com/problems/shuffle-string/

public class ShuffleString {
    public static void main(String[] args) {
        String s = "aaiougrt";
        int[] indices = {4,0,2,6,7,3,1,5};
        System.out.println(restoreString(s, indices));
    }

    static public String restoreString(String s, int[] indices) {
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            ans.setCharAt(indices[i], s.charAt(i));
        }
        return ans.toString();
    }
}
