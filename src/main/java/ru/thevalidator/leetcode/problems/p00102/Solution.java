/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<TreeNode> nextRow = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        List<Integer> start = new ArrayList<>();
        start.add(root.val);
        ans.add(start);
        if (root.left != null) {
            nextRow.add(root.left);
        }
        if (root.right != null) {
            nextRow.add(root.right);
        }

        while (!nextRow.isEmpty()) {
            LinkedList<TreeNode> row = nextRow;
            nextRow = new LinkedList<>();
            List<Integer> rowValues = new ArrayList<>();
            while (!row.isEmpty()) {
                TreeNode node = row.pollFirst();
                rowValues.add(node.val);
                if (node.left != null) {
                    nextRow.add(node.left);
                }
                if (node.right != null) {
                    nextRow.add(node.right);
                }
            }
            ans.add(rowValues);

        }

        return ans;

    }

}
