package com.company.LeetCode;

// https://leetcode.com/problems/roman-to-integer/

public class RomantoInteger {
    public static void main(String args[]){
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        char prev = ' ';
        for (char ch : s.toCharArray()) {
            switch(ch){
                case 'I':
                    result += 1;
                    break;

                case 'V':
                    if (prev == 'I'){
                        result -= 1;
                        result += 4;
                    }
                    else {
                        result += 5;
                    }
                    break;

                case 'X':
                    if (prev == 'I'){
                        result -= 1;
                        result += 9;
                    }
                    else {
                        result += 10;
                    }
                    break;

                case 'L':
                    if (prev == 'X'){
                        result -= 10;
                        result += 40;
                    }
                    else {
                        result += 50;
                    }
                    break;

                case 'C':
                    if (prev == 'X'){
                        result -= 10;
                        result += 90;
                    }
                    else {
                        result += 100;
                    }
                    break;

                case 'D':
                    if (prev == 'C'){
                        result -= 100;
                        result += 400;
                    }
                    else {
                        result += 500;
                    }
                    break;

                case 'M':
                    if (prev == 'C'){
                        result -= 100;
                        result += 900;
                    }
                    else {
                        result += 1000;
                    }
                    break;
            }
            prev = ch;
        }
        return result;
    }
}
