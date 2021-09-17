package com.company.LeetCode;

public class Palindrome_Number {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(palindrome(num));
    }

    private static boolean palindrome(int num) {
        if (num < 0){
            return false;
        }

        int rev = 0;
        int orignal = num;
        while (num > 0){
            rev = rev * 10 + num % 10;
            num = num / 10 ;
        }

        return orignal == rev;
    }
}
