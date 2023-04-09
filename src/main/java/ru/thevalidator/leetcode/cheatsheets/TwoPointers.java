/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.cheatsheets;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class TwoPointers {

    // Two pointers: one input, opposite ends
    public int fn(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;

        while (left < right) {
            // do some logic here with left and right
            boolean CONDITION = false;
            if (CONDITION) {
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }

    // Two pointers: two inputs, exhaust both
    public int fn2(int[] arr1, int[] arr2) {
        int i = 0, j = 0, ans = 0;

        while (i < arr1.length && j < arr2.length) {
            // do some logic here
            boolean CONDITION = false;
            if (CONDITION) {
                i++;
            } else {
                j++;
            }
        }

        while (i < arr1.length) {
            // do logic
            i++;
        }

        while (j < arr2.length) {
            // do logic
            j++;
        }

        return ans;
    }

}
