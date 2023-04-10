/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00409;

import java.util.HashMap;
import java.util.Map;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static int longestPalindrome(String s) {
        int res = 0;
        if (s.length() == 1) {
            return 1;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int odd = 0;
        for (Integer value: map.values()) {
            if (value % 2 == 0 ) {
                res += value;
            } else {
                if (value > odd) {
                    if(odd != 0) {
                        res += odd - 1;
                    }
                    odd = value;
                } else {
                    res += value - 1;
                }
            }
        }
        res += odd;
        
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ASDfeaasd"));
    }

}
