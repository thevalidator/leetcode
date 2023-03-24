/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00205;

import java.util.HashMap;
import java.util.Map;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static boolean isIsomorphic(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Character> chars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (chars.containsKey(a)) {
                if (b != chars.get(a)) {
                    return false;
                }
            } else {
                if (chars.containsValue(b)) {
                    return false;
                }
                chars.put(a, b);
            }
        }
        
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("expected: false  =  actual: " + isIsomorphic("badc", "baba"));
        System.out.println("expected:  true  =  actual: " + isIsomorphic("abab", "baba"));
        System.out.println("expected:  true  =  actual: " + isIsomorphic("title", "paper"));
        System.out.println("expected:  true  =  actual: " + isIsomorphic("paper", "title"));
    }
    
}
