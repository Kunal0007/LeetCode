package com.company.LeetCode;

// https://leetcode.com/problems/goal-parser-interpretation/

public class GoalInterpretation {
    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
    }

    static public String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}
