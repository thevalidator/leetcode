/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00392;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static boolean isSubsequence(String s, String t) {
        
        if (s.length() > t.length()) {
            return false;
        }
        
        int pointer = 0;
        int match = 0;
        for (char c: s.toCharArray()) {
            while (pointer < t.length()) {
                char a = t.charAt(pointer);
                pointer++;
                if (a == c) {
                    match++;
                    break;
                }
            }
        }
        
        return match == s.length();
    }
    
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
}
