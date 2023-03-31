/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00142;

import java.util.HashSet;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        
        if (head == null || head.next == null) {
            return null;
        }
        ListNode cycleStart = null;
        HashSet<ListNode> visited = new HashSet<>();
        ListNode act = head;
        while (act.next != null) {
            visited.add(act);
            act = act.next;
            if (visited.contains(act)) {
                return act;
            }
        }

        return cycleStart;
    }
}
