package com.company.LeetCode;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26){
            return false;
        }
        for (int i = 97; i <= 122; i++) {
            if (sentence.indexOf((char)i) < 0){
                return false;
            }
        }
        return true;
    }
}
