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
        System.out.println(gcdOfStrings(
                "TAUXXTAUXXTAUXXTAUXXTAUXX",
                "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX")); //"TAUXX"

        System.out.println(gcdOfStrings(
                "LEET",
                "CODE")); //""

    }

    public static String gcdOfStrings(String str1, String str2) {

        String divisor = "";
        int limit = Math.min(str1.length(), str2.length());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < limit; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return divisor;
            }
        }

        String longest = str1.length() > limit ? str1 : str2;
        for (int i = 0; i < limit; i++) {
            sb.append(longest.charAt(i));
            if (str1.length() % sb.length() != 0 || str2.length() % sb.length() != 0) {
                continue;
            }
            boolean isOk = true;
            for (int j = 0; j < longest.length(); j++) {
                if (longest.charAt(j) != sb.charAt(j % sb.length())) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                divisor = sb.toString();
            }
        }

        return divisor;
    }

}
