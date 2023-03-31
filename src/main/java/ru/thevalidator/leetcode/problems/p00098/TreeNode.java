/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00098;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
