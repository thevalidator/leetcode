/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00704;

import java.util.concurrent.TimeUnit;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {
    
    public static void main(String[] args) throws InterruptedException {
        //System.out.println(search(new int[] {-1,0,3,5,9,12}, 9));
        System.out.println(search(new int[] {5}, 5));
    }

    public static int search(int[] nums, int target) throws InterruptedException {
        
        int ans = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            System.out.printf(">> left=%d\tmiddle=%d\tright=%s\n", left, middle, right);
            
            if (nums[middle] == target) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle - 1;
                //middle -= (right - left + 1) / 2;
            } else if (target > nums[middle]) {
                left = middle + 1;
                //middle += (right - left + 1) / 2;
            }
            System.out.printf("<< left=%d\tmiddle=%d\tright=%s\n\n", left, middle, right);
            
            TimeUnit.SECONDS.sleep(3);
        }
        
        return ans;
    }
}
