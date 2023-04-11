/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p01046;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static int lastStoneWeight2(int[] stones) {
        List<Integer> list = new ArrayList<>(stones.length);
        for (int s: stones) {
            list.add(s);
        }
        while (list.size() > 1) {
            list.sort(Collections.reverseOrder());
            int one = list.remove(0);
            int two = list.remove(0);

            if (one != two) {
                int res = one - two;
                list.add(res);
            }
        }

        return list.isEmpty() ? 0 : list.get(0);
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i: stones) {
            queue.add(i);
        }
        int x;
        int y;
        while (queue.size() > 1) {
            y = queue.poll();
            x = queue.poll();
            if (y > x) {
                queue.offer(y - x);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }

    public static int lastStoneWeight3(int[] stones) {
        for (int i = stones.length - 1; i > 0; i--) {
            Arrays.sort(stones);
            stones[i - 1] = stones[i] - stones[i - 1];
        }
        return stones[0];
    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
        System.out.println(lastStoneWeight(new int[]{2, 2, 2, 2, 2, 2}));
        System.out.println(1%2);
        System.out.println(1/2);
    }
}
