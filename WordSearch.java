package com.company.LeetCode;

// https://leetcode.com/problems/word-search/

public class WordSearch {
    public static void main(String[] args) {
        char[][] s = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "CBFCED";
        System.out.println(exist(s, word));
    }

    static public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && solve(board, word, 0, i, j)) return true;
            }
        }
        return false;
    }

    private static boolean solve(char[][] board, String word, int s, int i, int j) {
        if (word.length() <= s) return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '0' || board[i][j] != word.charAt(s)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '0';

        if (solve(board, word, s + 1, i + 1, j) ||
            solve(board, word, s + 1, i - 1, j) ||
            solve(board, word, s + 1, i, j + 1) ||
            solve(board, word, s + 1, i, j - 1)
        ){
            return true;
        }

        board[i][j] = temp;

        return false;
    }
}


// My work - which is not working 😂
//        int i = 0, j = 0;
//        int cn = 0;
//        int count = 0;
//
//        while(count < word.length()) {
//            if (word.charAt(cn) == board[i][j]){
//                System.out.println(board[i][j]);
//                cn++;
//                count++;
//            }
//            if (j + 1 < board[0].length && word.charAt(cn) == board[i][j + 1]){
//                System.out.println(board[i][j + 1]);
//                j = j + 1;
//                cn++;
//                count++;
//            }
//            else if (i - 1 > 0 && word.charAt(cn) == board[i-1][j]){
//                System.out.println(board[i - 1][j]);
//                i = i - 1;
//                cn++;
//                count++;
//            }
//            else if (j - 1 > 0 && word.charAt(cn) == board[i][j - 1]){
//                System.out.println(board[i][j - 1]);
//                j = j - 1;
//                cn++;
//                count++;
//            }
//            else if (i + 1 < board.length && word.charAt(cn) == board[i + 1][j]){
//                System.out.println(board[i + 1][j]);
//                i = i + 1;
//                cn++;
//                count++;
//            }
//            else {
//                count = 0;
//                break;
//            }
//        }
//
//        return count > 0;