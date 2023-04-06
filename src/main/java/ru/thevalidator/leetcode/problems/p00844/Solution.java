/*
 * Copyright (C) 2023 thevalidator
 */

package ru.thevalidator.leetcode.problems.p00844;

import java.util.Stack;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {
    
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> first = new Stack<>();
        Stack<Character> second = new Stack<>();
        
        fillStack(first, s);
        fillStack(second, t);
        
        if (first.size() != second.size()) {
            return false;
        } else {
            while (!first.isEmpty()) {         
                if (!first.pop().equals(second.pop())) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static void fillStack(Stack<Character> stack, String s) {
        for (char c: s.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }                
            } else {
                stack.push(c);
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c") + " /true");
        System.out.println(backspaceCompare("y#fo##f", "y#f#o##f") + " /true");
    }

}
