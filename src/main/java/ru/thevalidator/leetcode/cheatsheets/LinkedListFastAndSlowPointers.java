/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.cheatsheets;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class LinkedListFastAndSlowPointers {

    public int fn(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int ans = 0;

        while (fast != null && fast.next != null) {
            // do logic
            slow = slow.next;
            fast = fast.next.next;
        }

        return ans;
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


