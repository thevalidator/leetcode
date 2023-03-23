/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00724;


/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static int pivotIndex2(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int sum = 0, leftsum = 0;
        for (int x : nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public static int pivotIndex(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int pivot = -1;
        int leftIndex = 1;
        int rightIndex = nums.length - 2;

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = nums[0];
        right[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length - 1; i++) {
            left[leftIndex] = nums[leftIndex] + left[leftIndex - 1];
            right[rightIndex] = nums[rightIndex] + right[rightIndex + 1];
            leftIndex++;
            rightIndex--;
        }

        if (right[1] == 0) {
            return 0;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            System.out.println("\t>> " + left[i] + " - " + right[i]);
            if (left[i] == right[i]) {
                return i;
            }
        }

        if (left[nums.length - 2] == 0) {
            return nums.length - 1;
        }

        return pivot;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex(new int[]{-1, -1, -1, -1, 0, 0}));
        System.out.println(pivotIndex(new int[]{-1, -1, 1, 1, 0, 0}));
        System.out.println(pivotIndex(new int[]{-1, -1, 0, 1, 1, -1}));
    }
}
