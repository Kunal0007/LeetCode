package com.company.LeetCode;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenNumber_ofDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,25,6,7896};
        System.out.println(evendigitno(arr));
    }

    private static int evendigitno(int[] arr) {
        int count = 0;
        for (int num:arr) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int noofdigits = digits(num);
        return noofdigits % 2 == 0;
    }

    private static int digits(int num) {
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
