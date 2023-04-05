/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00062;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static int uniquePaths(int m, int n) {
        return paths(m, n, new int[m+1][n+1]);
    }

    public static int paths(int m, int n, int[][] arr) {
        if (m < 1 || n < 1) {
            return 0;
        }
        if (m == 1 && n == 1) {
            return 1;
        }
        if (arr[m][n] != 0) {
            return arr[m][n];
        }
        arr[m][n] = paths(m - 1, n, arr) + paths(m, n - 1, arr);
        
        return arr[m][n];
        
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
}
