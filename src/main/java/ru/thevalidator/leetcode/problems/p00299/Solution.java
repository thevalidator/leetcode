/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00299;

import java.util.HashMap;
import java.util.Map;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static String getHint(String secret, String guess) {
        
        int bulls = 0;
        int cows = 0;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                continue;
            }
            
            if (map.containsKey(secret.charAt(i))) {
                map.put(secret.charAt(i), (map.get(secret.charAt(i)) + 1));
            } else {
                map.put(secret.charAt(i), 1);
            }
            
            if (map2.containsKey(guess.charAt(i))) {
                map2.put(guess.charAt(i), (map2.get(guess.charAt(i)) + 1));
            } else {
                map2.put(guess.charAt(i), 1);
            }
            
        }
        
        for (Map.Entry<Character, Integer> entry: map2.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (map.containsKey(key)) {
                int number = map.get(key);
                if (number >= value) {
                    cows += value;
                } else {
                    cows += number;
                }
            }
        }
        
        return String.format("%dA%dB", bulls, cows);
    }
    
    public static void main(String[] args) {
        System.out.println(getHint("1807", "7810") + " //1A3B ");
        System.out.println(getHint("1123", "0111") + " //1A1B ");
        System.out.println(getHint("1123", "1113") + " //3A0B ");
    }

}
