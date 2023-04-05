/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00394;

import java.util.Stack;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static String decodeString(String s) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        Stack<Character> temp = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ']') {
                char t;
                while ((t = stack.pop()) != '[') {
                    temp.add(t);
                }
                
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    sb.append(stack.pop());
                }
                int times = Integer.parseInt(sb.reverse().toString());
                sb.setLength(0);
                while (!temp.isEmpty()) {
                    sb.append(temp.pop());
                }
                String part = sb.toString();
                for (int j = 0; j < times - 1; j++) {
                    sb.append(part);
                }
                for (int j = 0; j < sb.length(); j++) {
                    stack.add(sb.charAt(j));
                }
                sb.setLength(0);

            } else {
                stack.add(c);
            }

        }

        
        for (Character character: stack) {
            sb.append(character);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("3[a2[c]]"));
    }
}
