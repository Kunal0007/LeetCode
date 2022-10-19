package com.company.LeetCode;

import java.util.*;

// https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/

public class RemoveDigit {
    public static void main(String[] args) {
        String number = "1231";
        char digit = '1';
        System.out.println(removeDigit(number, digit));
    }

    static public String removeDigit(String number, char digit) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < number.length(); i++){
            if (number.charAt(i) == digit) {
                String news = number.substring(0, i) + number.substring(i + 1);
                list.add(news);
            }
        }
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

}
