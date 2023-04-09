/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.cheatsheets;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class TopKElementsWithHeap {

    public int[] fn(int[] arr, int k) {
        // create comparator logic
        Comparator CRITERIA = (o1, o2) -> {
            return 0;
        };
        PriorityQueue<Integer> heap = new PriorityQueue<>(CRITERIA);
        for (int num: arr) {
            heap.add(num);
            if (heap.size() > k) {
                heap.remove();
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.remove();
        }

        return ans;
    }
}
