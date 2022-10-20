package com.company.LeetCode;

// https://leetcode.com/problems/integer-to-roman/

public class IntegertoRoman {
    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }

    static public String intToRoman(int num) {
        String[] digits = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] t = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] h = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] th = {"", "M", "MM", "MMM"};
        return th[num/1000] + h[(num/100)%10] + t[(num/10)%10] + digits[num%10];
    }
}
