/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00692;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static List<String> topKFrequent(String[] words, int k) {
        
        Map<String, Integer> map = new HashMap<>();
        for (String w: words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        
        Set<WordStat> stats = new TreeSet<>((o1, o2) -> {
            int res = Integer.compare(o2.freq, o1.freq);
            if (res == 0) {
                return o1.word.compareTo(o2.word);
            }
            return res;
        });
        
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            stats.add(new WordStat(key, value));
        }
        
        List<String> list = new ArrayList<>();
        int counter = 0;
        for (WordStat s: stats) {
            list.add(s.word);
            if (++counter == k) {
                break;
            }
            
        }
        
        return list;
    }
    
        

    public static void main(String[] args) {
        //var l = topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4);
        var l = topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2);
        for (String s: l) {
            System.out.println("> " + s);
        }

    }
}

class WordStat {
    String word;
    int freq;

    public WordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }
}
