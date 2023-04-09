/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.cheatsheets;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class GraphDFS {

    Set<Integer> seen = new HashSet<>();

    /*
    Graph: DFS (recursive)

    For the graph templates, 
    assume the nodes are numbered from 0 to n - 1 
    and the graph is given as an adjacency list. 
    Depending on the problem, you may need 
    to convert the input into an equivalent 
    adjacency list before using the templates.
     */
    public int fn(int[][] graph) {
        int START_NODE = 0; // find start node
        seen.add(START_NODE);
        return dfs(START_NODE, graph);
    }

    public int dfs(int node, int[][] graph) {
        int ans = 0;
        // do some logic
        for (int neighbor: graph[node]) {
            if (!seen.contains(neighbor)) {
                seen.add(neighbor);
                ans += dfs(neighbor, graph);
            }
        }

        return ans;
    }

    
    
    
    public int fnIterative(int[][] graph) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> seen = new HashSet<>();
        int START_NODE = 0; // find start node
        stack.push(START_NODE);
        seen.add(START_NODE);
        int ans = 0;

        while (!stack.empty()) {
            int node = stack.pop();
            // do some logic
            for (int neighbor: graph[node]) {
                if (!seen.contains(neighbor)) {
                    seen.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }

        return ans;
    }
}
