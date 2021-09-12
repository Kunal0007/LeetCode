package com.company.LeetCode;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Reverse number: " + reverse(x));
    }
    static int reverse(int x) {
        long rev = 0;
        boolean flag = false;
        if (x < 0){
            flag = true;
            x *= -1;
        }
        while(x > 0){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        if(rev > Integer.MAX_VALUE) return 0;
        return (int) (flag ? -rev : rev);
    }
}
