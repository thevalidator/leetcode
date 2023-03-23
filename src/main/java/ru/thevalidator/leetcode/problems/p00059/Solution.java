/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00059;

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
    
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
