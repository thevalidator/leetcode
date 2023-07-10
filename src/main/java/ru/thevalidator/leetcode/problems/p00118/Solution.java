/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00118;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    //TODO: refactor
    
    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> generate(int numRows) {
        result.clear();
        for (int i = 1; i <= numRows; i++) {
            result.add(generateRow(i));
        }

        return result;
    }

    public static void main(String[] args) {

    }

    private static List<Integer> generateRow(int number) {
        List<Integer> row = new ArrayList<>();
        if (number == 1) {
            row.add(1);
        }
        if (number == 2) {
            row.add(1);
            row.add(1);
        }
        row.add(1);
        var list = result.get(number - 2);
        for (int i = 1; i < number - 1; i++) {
            
            int value = list.get(i-1) + list.get(i);
            row.add(value);
        }
        row.add(1);

        return row;
    }

}
