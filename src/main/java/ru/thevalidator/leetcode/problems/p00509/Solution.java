/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00509;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static int fib(int n) {
        int a = 0;
        int b = 1;

        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        }
        int tmp;
        for (int i = 1; i < n; i++) {
            tmp = b;
            b = b + a;
            a = tmp;
        }

        return b;
    }

    //from leetcode
    public static int fib2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
