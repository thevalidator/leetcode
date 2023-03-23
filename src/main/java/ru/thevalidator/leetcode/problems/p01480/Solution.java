/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p01480;

import java.util.Arrays;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i] + res[i - 1];
        }
        
        return res;
    }
    
    public static int[] runningSum2(int[] nums) {
        
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        
        return nums;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(runningSum2(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(runningSum2(new int[] {4})));
    }
}
