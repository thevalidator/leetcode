/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00066;

import java.util.Arrays;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution2 {
    
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,0,9,9,9,9};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(plusOne(array)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        System.out.println(Arrays.toString(digits));
        digits[0] = 1;
        return digits;
    }

}
