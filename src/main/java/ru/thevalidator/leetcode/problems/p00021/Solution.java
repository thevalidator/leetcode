/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00021;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if (list1 == null && list2 == null) {
            return null;
        } 
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode start;
        
        if (l1.val <= l2.val) {
            start = l1;
            l1 = l1.next;
        } else {
            start = l2;
            l2 = l2.next;
        }
        
        ListNode actual = start;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                actual.next = l1;
                l1 = l1.next;
            } else {
                actual.next = l2;
                l2 = l2.next;
            }
            actual = actual.next;
        }
        
        if (l1 != null) {
            actual.next = l1;
        } else if (l2 != null) {
            actual.next = l2;
        }

        return start;
    }
}
