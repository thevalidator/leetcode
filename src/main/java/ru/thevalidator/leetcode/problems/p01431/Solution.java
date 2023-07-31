/*
 * Copyright (C) 2023 thevalidator
 */

package ru.thevalidator.leetcode.problems.p01431;

import java.util.Arrays;
import java.util.List;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {
    
    public static void main(String[] args) {
        
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] result = new Boolean[candies.length];
        int max = Integer.MIN_VALUE;
        for (int c: candies) {
            if (c > max) {
                max = c;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            result[i] = candies[i] + extraCandies >= max;
        }
        return Arrays.asList(result);
    }

}
