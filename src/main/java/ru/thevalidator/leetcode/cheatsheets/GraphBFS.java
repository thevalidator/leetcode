/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.cheatsheets;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class GraphBFS {

    public int fn(int[][] graph) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();
        int START_NODE = 0; // find start node
        queue.add(START_NODE);
        seen.add(START_NODE);
        int ans = 0;

        while (!queue.isEmpty()) {
            int node = queue.remove();
            // do some logic
            for (int neighbor: graph[node]) {
                if (!seen.contains(neighbor)) {
                    seen.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        return ans;
    }
}
