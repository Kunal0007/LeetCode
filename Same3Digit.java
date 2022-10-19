package com.company.LeetCode;

// https://leetcode.com/problems/largest-3-same-digit-number-in-string/

public class Same3Digit {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6777133339"));
    }
    static public String largestGoodInteger(String num) {
        String ans = "0";
        for(int i = 0; i < num.length() - 2; i++){
            String temp = "0";
            if(num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)){
                temp = num.substring(i, i+3);
                if (ans.charAt(0) <= temp.charAt(0)){
                    ans = temp;
                }
            }

        }

        return ans.length() == 3 ? ans : "";
    }
}
