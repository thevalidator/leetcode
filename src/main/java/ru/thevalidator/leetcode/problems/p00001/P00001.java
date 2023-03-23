/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00001;

import java.util.HashMap;
import java.util.Map;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class P00001 {

    public static int[] twoSum(int[] nums, int target) {
        int[] answer = null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];
            if (map.containsKey(search)) {
                answer = new int[] {map.get(search), i};
                break;
            }
            map.put(nums[i], i);
        }
        
        return answer;
    }
    
}
