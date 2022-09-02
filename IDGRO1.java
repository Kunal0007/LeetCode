package com.company.LeetCode;

import java.util.*;

// https://leetcode.com/problems/insert-delete-getrandom-o1/

class RandomizedSet {
    Set<Integer> s;
    public RandomizedSet() {
        s = new HashSet<Integer>();
    }

    public boolean insert(int val) {
        if(s.isEmpty()){
            s.add(val);
            return true;
        }
        if(s.contains(val)){
            return false;
        }
        s.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(s.isEmpty()){
            return false;
        }
        if(s.contains(val)){
            s.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        Random rand = new Random();
        List<Integer> lst=new ArrayList<>(s);
        return lst.get(rand.nextInt(lst.size()));
    }
}

public class IDGRO1 {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        boolean param_1 = randomizedSet.insert(1);
        boolean param_2 = randomizedSet.insert(1);
        boolean param_3 = randomizedSet.remove(2);
        int param_4 = randomizedSet.getRandom();
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
