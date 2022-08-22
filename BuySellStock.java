package com.company.LeetCode;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    static public int maxProfit(int[] prices) {
        int profit = 0;
        int fix = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            if (fix - prices[i] >= profit){
                profit = fix - prices[i];
            }
            else if (fix - prices[i] < 0){
                fix  = prices[i];
            }
        }
        return profit;
    }
}
