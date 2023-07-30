/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p01071;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static void main(String[] args) {

        //System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX")); //"TAUXX"

    }

    public static String gcdOfStrings(String str1, String str2) {
        int limit = Math.min(str1.length(), str2.length());
        StringBuilder sb = new StringBuilder();

        //check if the longest string statrs with the shortest one 
        for (int i = 0; i < limit; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            } else {
                return "";
            }
        }

        String longString;
        if (str1.length() > limit) {
            longString = str1;
        } else {
            longString = str2;
        }
        System.out.println("longest: " + longString);

        if (longString.length() > limit) {

            if (longString.length() % limit == 0) {
                System.out.println("\tostatok raven korotkoi stroke");
                for (int i = 0; i < longString.length() / limit; i++) {
                    if (longString.charAt(i + (i * limit)) != sb.charAt(i)) {
                        return "";
                    }
                }
            } else {
                if (sb.length() % 2 != 0) {
                    System.out.println("divisor is even");
                    return "";
                } else {
                    while (sb.length() / 2 != 1) {
                        String part1 = sb.substring(0, sb.length() / 2);
                        String part2 = sb.substring(sb.length() / 2);
                        System.out.println("\t\tp1=" + part1 + " p2=" + part2);
                        sb.setLength(sb.length() / 2);
                        if (!part1.equals(part2)) {
                            return "";
                        }
                        if (longString.length() % (sb.length() / 2) == 0) {
                            break;
                        }
                    }
                }
                for (int i = 0; i < longString.length(); i++) {
                    if (longString.charAt(i) != sb.charAt(i % sb.length())) {
                        System.out.println("char not equals");
                        return "";
                    }
                }
            }

        }

        return sb.toString();
    }

}
