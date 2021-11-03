package com.company.LeetCode;

import java.util.List;

// https://leetcode.com/problems/count-items-matching-a-rule

public class MatchingARule {
    public static void main(String[] args) {

    }

    static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        for (List<String> item: items) {
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)){
               ans++;
            }
            else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)){
                    ans++;
            }
            else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)){
                    ans++;
            }
        }
        return ans;
    }
}
