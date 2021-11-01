package com.company.LeetCode;

public class Subtract_Product_Sum_Digits {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }

    static public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0){
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n = n / 10;
        }
        return product - sum;
    }
}
