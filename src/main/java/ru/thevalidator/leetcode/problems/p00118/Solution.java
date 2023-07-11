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

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(getBaseRowTemplate());
        for (int i = 1; i < numRows; i++) {
            result.add(generateNextRow(result.get(i - 1)));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    private static List<Integer> generateNextRow(List<Integer> previousRow) {
        List<Integer> row = getBaseRowTemplate();
        int loopSize = previousRow.size() - 1;
        for (int i = 1; i <= loopSize; i++) {
            int value = previousRow.get(i - 1) + previousRow.get(i);
            row.add(value);
        }
        row.add(1);
        return row;
    }

    private static List<Integer> getBaseRowTemplate() {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        return row;
    }

}
