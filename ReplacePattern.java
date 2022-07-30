package com.company.LeetCode;

import java.util.*;

// https://leetcode.com/problems/find-and-replace-pattern/

public class ReplacePattern {
    public static void main(String[] args) {
        String[] words = {"abc","deq","meee","aqqd","dkd","ccc"};
        List<String> result = new ArrayList<String>();
        result = findAndReplacePattern(words, "abbd");
        System.out.println(result);
    }

    static public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        ArrayList<Integer> list = count(pattern);
        for (String s: words) {
            ArrayList<Integer> i = count(s);
            if (list.equals(i)){
                result.add(s);
            }
        }
        return result;
    }

    static public ArrayList<Integer> count(String s){
        LinkedHashMap<String, Integer> p = new LinkedHashMap<String, Integer>();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (p.containsKey(s.charAt(i) + "")){
                p.put(s.charAt(i) + (i + ""), p.get(s.charAt(i) + ""));
            }
            else {
                index += 1;
                p.put(s.charAt(i) + "", index);
            }
        }
        System.out.println(p);
        return new ArrayList<>(p.values());
    }
}
