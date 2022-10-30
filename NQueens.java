package com.company.LeetCode;

import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        solveNQueens(4);
    }

    static public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        List<String> cb = new ArrayList<>();
        ArrayList<Integer> lr = new ArrayList<>(Collections.nCopies(n, 0));
        ArrayList<Integer> ld = new ArrayList<>(Collections.nCopies(2*n - 1, 0));
        ArrayList<Integer> ud = new ArrayList<>(Collections.nCopies(2*n - 1, 0));
        String s = "";
        for(int i = 0; i < n; i++){
            s += ".";
        }
        System.out.println(s);
        for(int i = 0; i < n; i++){
            cb.add(s);
        }
        System.out.println(cb);
        solve(0, cb, list, lr, ld, ud, n);
        return list;
    }

    public static void solve(int col, List<String> cb, List<List<String>> list, ArrayList<Integer> lr, ArrayList<Integer> ld, ArrayList<Integer> ud, int n) {
        if (col == n){
            list.add(new ArrayList<>(cb));
            return;
        }

        for (int row = 0; row < n; row++){
            if (lr.get(row) == 0 && ld.get(row + col) == 0 && ud.get(n - 1 + col - row) == 0){
                String news = cb.get(row).substring(0,col) + 'Q' + cb.get(row).substring(col + 1);
                cb.set(row, news);
                lr.set(row, 1);
                ld.set(row + col, 1);
                ld.set(n - 1 + col - row, 1);
                System.out.println(cb.get(row));
                solve(col + 1, cb, list, lr, ld, ud, n);
                String olds = cb.get(row).substring(0,col) + '.' + cb.get(row).substring(col + 1);
                cb.set(row, olds);
                lr.set(row, 0);
                ld.set(row + col, 0);
                ld.set(n - 1 + col - row, 0);
            }
        }

    }

//    static public List<List<String>> solveNQueens(int n) {
//        List<List<String>> list = new ArrayList<>();
//        List<String> cb = new ArrayList<>();
//        String s = "";
//        for(int i = 0; i < n; i++){
//            s += ".";
//        }
//        System.out.println(s);
//        for(int i = 0; i < n; i++){
//            cb.add(s);
//        }
//        System.out.println(cb);
//        solve(0, cb, list, n);
//        return list;
//    }

//    static public void solve(int col, List<String> cb, List<List<String>> list, int n){
//        if(col == n){
//            list.add(new ArrayList<>(cb));
//            return;
//        }
//
//        for(int row = 0; row < n; row++){
//            if(notattack(row, col, cb, n)){
//                String news = cb.get(row).substring(0,col) + 'Q' + cb.get(row).substring(col + 1);
//                cb.set(row, news);
//                System.out.println(cb.get(row));
//                solve(col + 1, cb, list, n);
//                String olds = cb.get(row).substring(0,col) + '.' + cb.get(row).substring(col + 1);
//                cb.set(row, olds);
//            }
//        }
//    }
//
//    public static boolean notattack(int row, int col, List<String> cb, int n) {
//        int copyrow = row;
//        int copycol = col;
//
//        while (col >= 0 && row >= 0){
//            if (cb.get(row).charAt(col) == 'Q') return false;
//            col--;
//            row--;
//        }
//
//        row = copyrow;
//        col = copycol;
//
//        while (col >= 0){
//            if (cb.get(row).charAt(col) == 'Q') return false;
//            col--;
//        }
//
//        col = copycol;
//
//        while (col >= 0 && row < n){
//            if (cb.get(row).charAt(col) == 'Q') return false;
//            col--;
//            row++;
//        }
//
//        return true;
//    }
}
