/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.cheatsheets;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class BinarySearch {

    public int fn(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                // do something
                return mid;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // left is the insertion point
        return left;
    }

    // Binary search: duplicate elements, left-most insertion point
    public int fn2(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // Binary search: duplicate elements, right-most insertion point
    public int fn3(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // Binary search: for greedy problems. If looking for a minimum:
    public int fn4(int[] arr) {
        int left = 0;//MINIMUM_POSSIBLE_ANSWER;
        int right = 0;//MAXIMUM_POSSIBLE_ANSWER;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public boolean check(int x) {
        boolean BOOLEAN = false;
        // this function is implemented depending on the problem
        return BOOLEAN;
    }

    // Binary search: for greedy problems. If looking for a maximum:
    public int fn5(int[] arr) {
        int left = 0;//MINIMUM_POSSIBLE_ANSWER;
        int right = 0;//MAXIMUM_POSSIBLE_ANSWER;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

}
