/*
 * Copyright (C) 2023 thevalidator
 */

package ru.thevalidator.leetcode.problems.p01768;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {
    
    public static void main(String[] args) {
        
        System.out.println(mergeAlternately("ace", "bd"));
        
    }
    
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder(word1.length() + word2.length());
        int limit = Math.min(word1.length(), word2.length());
        for (int i = 0; i < limit; i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (word1.length() != word2.length()) {
            if (word1.length() > word2.length()) {
                sb.append(word1.substring(limit));
            } else {
                sb.append(word2.substring(limit));
            }
        }
        
        return sb.toString();
    }

}
