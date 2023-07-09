/*
 * Copyright (C) 2023 thevalidator
 */

package ru.thevalidator.leetcode.problems.p00136;

import java.util.HashSet;
import java.util.Set;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {
    
    public static void main(String[] args) {
        
    }
    
    public static int singleNumber(int[] nums) {
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        Set<Integer> values = new HashSet<>();
        
        for (int n: nums) {
            if (values.contains(n)) {
                values.remove(n);
            } else {
                values.add(n);
            }
        }
        
        return values.iterator().next();
        
    }
    
    //TODO: understand it
    public static int singleNumber2(int[] nums) {
        int XOR = nums[0];
        for(int i=1;i<nums.length;i++){
            XOR = XOR ^ nums[i];
        }
        return XOR;
    }

}
