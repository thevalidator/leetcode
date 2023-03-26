/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00876;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        
        ListNode middle = head;
        ListNode actual = head;
        int counter = 0;
        int middleIndex = 1;
        while (actual != null) {
            counter++;
            if (counter >= middleIndex * 2) {
                middleIndex = counter / 2 + 1;
                middle = middle.next;
            }
            actual = actual.next;
        }
        
        return middle;
    }
}
