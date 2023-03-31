/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00278;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static void main(String[] args) {
        firstBadVersion(3);
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int middle = -1;

        while (left <= right) {
            middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        if (isBadVersion(middle)) {
            return middle;
        } else {
            return middle + 1;
        }
    }
    
    
    public int firstBadVersion2(int n) {
        
        int left = 1;
        int right = n;

        while (left < right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return left;
        
    }

    public static boolean isBadVersion(int version) {
        return version >= 2;
    }
}
