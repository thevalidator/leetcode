/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.cheatsheets;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class PrefixSum {

    public int[] fn(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }
    
}
