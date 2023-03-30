/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00589;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static void main(String[] args) {
        Node n = new Node(1, Arrays.asList(new Node(2), new Node(3, Arrays.asList(new Node(6), new Node(7))), new Node(4)));

        for (Integer integer: preorder(n)) {
            System.out.println(integer);
        }

    }

    public static List<Integer> preorder(Node root) {

        List<Integer> answer = new ArrayList<>();
        preorder(answer, root);

        return answer;

    }

    public static void preorder(List<Integer> answer, Node node) {
        if (node != null) {
            answer.add(node.val);
            if (node.children != null) {
                for (Node n: node.children) {
                    preorder(answer, n);
                }
            }
        }
    }

}
