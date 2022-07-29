package com.company.LeetCode;

// https://leetcode.com/problems/find-the-winner-of-the-circular-game/

public class CircularGame {
    public static void main(String[] args) {
        System.out.println(findTheWinner(6, 5));
    }

    static public int findTheWinner(int n, int k) {
        return winner(n, k) + 1;
    }

    static public int winner(int n, int k){
        if (n == 1){
            return 0;
        }
        return (winner(n -1, k) + k) % n;
    }
}
