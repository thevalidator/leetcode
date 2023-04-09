/*
 * Copyright (C) 2023 thevalidator
 */

package ru.thevalidator.leetcode.cheatsheets;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class SlidingWindow {
    
    // Sliding window
    public int fn(int[] arr) {
        int left = 0, ans = 0, curr = 0;

        for (int right = 0; right < arr.length; right++) {
            // do logic here to add arr[right] to curr

            boolean WINDOW_CONDITION_BROKEN = false;
            while (WINDOW_CONDITION_BROKEN) {
                // remove arr[left] from curr
                left++;
            }

            // update ans
        }

        return ans;
    }

}
