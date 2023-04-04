/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00746;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        
        for (int i = 2; i < cost.length; i++) {
            cost[i] = cost[i] + Math.min(cost[i - 1], cost[i - 2]);
        }
        
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
    
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[] {10, 20, 1, 3, 10, 99, 11, 99, 99, 11, 2, 3}));
    }
}
