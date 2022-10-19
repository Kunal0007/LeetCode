package com.company.LeetCode;

import java.util.*;
import java.util.Map.*;

// https://leetcode.com/problems/top-k-frequent-words/

public class FrequentWords {
    public static void main(String[] args) {
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        System.out.println(topKFrequent(words, 4));
    }

    static public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (String s : words) {
            if(!map.containsKey(s)){
                map.put(s, 1);
            }
            else {
                map.put(s, map.get(s) + 1);
            }
        }
        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
//        System.out.println(map);
//        System.out.println(list);

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            ans.add(list.get(i).getKey());
        }
//        System.out.println(ans);

        return ans;
    }

}
