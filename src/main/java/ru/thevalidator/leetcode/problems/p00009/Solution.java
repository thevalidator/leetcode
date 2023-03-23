/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00009;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int tmp = x;
        int reverse = 0;
        while (tmp > 0) {
            reverse = 10 * reverse + (tmp % 10);
            tmp /= 10;
        }
        
        return reverse == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(559909955));
    }
}
