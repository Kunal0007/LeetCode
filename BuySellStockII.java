package com.company.LeetCode;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

public class BuySellStockII {
    public static void main(String[] args) {
        int[] prices = {7,1,7,3,4,9};
        System.out.println(maxProfit(prices));
    }

    static public int maxProfit(int[] prices) {
//        int profit = 0;
//        int tp = 0;
//        int fixed = prices[prices.length - 1];
//        for (int i = prices.length - 2; i >= 0 ; i--) {
//            if (fixed - prices[i] >= profit){
//                profit = fixed - prices[i];
//                System.out.println("profit:" + profit);
//            }
//            else if (fixed - prices[i] < 0){
//                fixed = prices[i];
//            }
//            else if (fixed - prices[i] < profit){
//                tp += profit;
//                System.out.println(tp);
//                fixed = prices[i];
//            }
//        }
//        tp += profit;
//        System.out.println(tp);
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
