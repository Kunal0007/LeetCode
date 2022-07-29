package com.company.LeetCode;

// https://leetcode.com/problems/valid-anagram/

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("aacc", "ccac"));
    }

    static public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chart);

        String sorts = new String(chars);
        String sortt = new String(chart);

        return sorts.equals(sortt);
    }
}
