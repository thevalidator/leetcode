/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00206;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode tmp;
        ListNode actual = head;
        
        if (head == null) {
            return null;
        }

        while (actual.next != null) {
            tmp = actual.next;
            actual.next = prev;
            prev = actual;
            actual = tmp;
        }
        actual.next = prev;

        return actual;
    }
}
