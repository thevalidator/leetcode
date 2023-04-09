/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.cheatsheets;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class BinaryTreeBFS {

    public int fn(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int ans = 0;

        while (!queue.isEmpty()) {
            int currentLength = queue.size();
            // do logic for current level

            for (int i = 0; i < currentLength; i++) {
                TreeNode node = queue.remove();
                // do logic
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return ans;
    }
}
