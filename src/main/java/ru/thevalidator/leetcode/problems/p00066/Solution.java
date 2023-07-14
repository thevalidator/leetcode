/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00066;

import java.util.Arrays;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    static int carry = 1;

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,0,9,9,9,9};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(plusOne(array)));
    }

    public static int[] plusOne(int[] digits) {
        carry = 1;
        digits[digits.length - 1] = process(digits[digits.length - 1]);
        if (carry > 0 && digits.length > 1) {
            for (int i = digits.length - 2; i >= 0; i--) {
                digits[i] = process(digits[i]);
                if (carry == 0) {
                    break;
                }
            }
        }
        if (carry > 0) {
            int[] newOne = new int[digits.length + 1];
            newOne[0] = 1;
            System.arraycopy(digits, 0, newOne, 1, digits.length);
            digits = newOne;
        }

        return digits;
    }

    public static int process(int number) {
        int value = number + carry--;
        if (value > 9) {
            carry++;
            value = value % 10;
        }
        return value;
    }

}
