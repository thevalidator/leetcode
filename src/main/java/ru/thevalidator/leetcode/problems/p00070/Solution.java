/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00070;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        int a = 2;
        int b = 3;
        int tmp = 0;
        for (int i = 4; i <= n; i++) {
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return tmp;
    }
    
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
