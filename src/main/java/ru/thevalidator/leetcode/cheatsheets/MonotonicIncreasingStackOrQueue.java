/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.cheatsheets;

import java.util.Stack;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class MonotonicIncreasingStackOrQueue {

    public int fn(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for (int num: arr) {
            // for monotonic decreasing, just flip the > to <
            while (!stack.empty() && stack.peek() > num) {
                // do logic
                stack.pop();
            }

            stack.push(num);
        }

        return ans;
    }
}
