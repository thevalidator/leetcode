/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00589;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution2 {

    public List<Integer> preorder(Node root) {
        // To store the output array...
        List<Integer> output = new ArrayList<>();
        // Base case: if the tree is empty...
        if (root == null) {
            return output;
        }
        // Create a stack of Node and push root to it...
        Stack<Node> st = new Stack<>();
        st.push(root);
        // Traverse till stack is not empty...
        while (!st.isEmpty()) {
            // Pop a Node from the stack and add it to the output list...
            Node node = st.pop();
            output.add(node.val);
            // Push all of the child nodes of the node into the stack from right to left...
            // Push from right to left to get the right preorder traversal...
            for (int idx = node.children.size() - 1; idx >= 0; idx--) {
                Node child = node.children.get(idx);
                st.push(child);
            }
        }
        return output;      // Return the output...
    }
}
