/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00002;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode node = result;
        int carry = 0;

        while (true) {
            int sum = l1.val + l2.val + carry;
            if (sum > 9) {
                node.val = sum % 10;
                carry = 1;
            } else {
                node.val = sum;
                carry = 0;
            }

            l1 = l1.next;
            l2 = l2.next;
            if (l1 == null || l2 == null) {
                break;
            }
            node.next = new ListNode();
            node = node.next;
        }

        if (l1 != null) {
            node.next = l1;
        } else if (l2 != null) {
            node.next = l2;
        }

        while (carry != 0) {
            if (node.next == null) {
                node.next = new ListNode(carry);
                carry = 0;
            } else {
                node = node.next;
                int val = node.val + carry;
                if (val < 9) {
                    node.val = val % 10;
                } else {
                    node.val = val;
                    carry = 0;

                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode sum = addTwoNumbers(l1, l2);

        print(sum);

        ListNode l3 = new ListNode(9, new ListNode(8));
        ListNode l4 = new ListNode(1);
        ListNode sum2 = addTwoNumbers(l3, l4);

        print(sum2);

    }

    public static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
        System.out.println();
    }

}
