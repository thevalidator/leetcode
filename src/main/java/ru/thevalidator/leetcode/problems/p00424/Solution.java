/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00424;

import java.util.HashSet;
import java.util.Set;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static int characterReplacement(String s, int k) {

        if (s.length() - k == 1) {
            return s.length();
        }

        int result = 0;
        Set<Character> set = new HashSet<>();
        for (char c: s.toCharArray()) {
            set.add(c);
        }

        for (Character c: set) {

            int replacements = k;
            int counter = 0;

            int j = 0;
            for (int i = 0; i < s.length(); i++) {

                while (replacements >= 0 && j < s.length()) {
                    if (s.charAt(j) != c) {
                        replacements--;
                    }
                    counter++;
                    j++;
                }

                int tmpResult = counter + replacements;
                if (tmpResult > s.length()) {
                    tmpResult = s.length();
                }

                result = tmpResult > result ? tmpResult : result;

                if (s.charAt(i) != c) {
                    replacements++;
                }
                counter--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));  //4
        System.out.println(characterReplacement("ABAB", 2));     //4
        System.out.println(characterReplacement("AAAA", 0));     //4
        System.out.println(characterReplacement("BAAAA", 0));    //4
        System.out.println(characterReplacement("ABAA", 0));     //2
    }

}
