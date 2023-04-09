/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.cheatsheets;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class ReversingLinkedList {

    public ListNode fn(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
