/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00121;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public int maxProfit(int[] prices) {
        
        if (prices.length == 1) {
            return 0;
        } else if (prices.length == 2) {
            return prices[1] > prices[0] ? prices[1] - prices[0] : 0;
        }
        
        int profit = 0;
        int buy = prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        
        return profit;
    }

}
