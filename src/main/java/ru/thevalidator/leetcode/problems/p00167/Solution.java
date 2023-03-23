/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00167;

import java.util.Arrays;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    //slow
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 2) {
            return new int[]{1, 2};
        }

        for (int left = 0; left < numbers.length - 1; left++) {
            int right = left + 1;
            while (right < numbers.length) {
                if (numbers[left] + numbers[right] == target) {
                    return new int[]{left + 1, right + 1};
                }
                right++;
            }
        }

        return new int[2];
    }

    //fast
    public static int[] twoSum2(int[] numbers, int target) {
        if (numbers.length == 2) {
            return new int[]{1, 2};
        }

        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                break;
            }
            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[] {left + 1, right + 1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{5, 25, 75}, 100)));
    }
}
