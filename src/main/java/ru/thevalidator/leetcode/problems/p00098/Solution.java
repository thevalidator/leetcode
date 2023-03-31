/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00098;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {
    
    long low = Long.MIN_VALUE;
    long max = Long.MAX_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        return isValidNode(low, max, root);
        
    }

    public boolean isValidNode(long low, long max, TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.val >= max || root.val <= low) {
            return false;
        }
        
        return isValidNode(low, root.val, root.left) && 
                isValidNode(root.val, max, root.right);
    }
}
