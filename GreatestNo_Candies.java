package com.company.LeetCode;

import java.util.ArrayList;

import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

public class GreatestNo_Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>(candies.length);
        int greatest = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > candies[greatest]){
                greatest = i;
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= candies[greatest]) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
