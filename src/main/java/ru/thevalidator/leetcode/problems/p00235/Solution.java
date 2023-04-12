/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00235;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);
        if ((min < root.val && max > root.val) || root.val == p.val || root.val == q.val) {
            return root;
        }
        
        if (min < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
        
    }
    
    public static void main(String[] args) {
        
    }
    
}


