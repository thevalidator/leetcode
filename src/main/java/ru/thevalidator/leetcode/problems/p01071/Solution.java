/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p01071;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static void main(String[] args) {

        String s11 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String s12 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        
        String s21 = "LEET";
        String s22 = "CODE";
        
        System.out.println(gcdOfStrings(s11, s12)); //"TAUXX"
        System.out.println(gcdOfStrings(s21, s22)); //""
        
        Solution2 s = new Solution2();
        System.out.println(s.gcdOfStrings(s11, s12));
        System.out.println(s.gcdOfStrings(s21, s22));
        

    }

    public static String gcdOfStrings(String str1, String str2) {

        String divisor = "";
        int limit = Math.min(str1.length(), str2.length());

        StringBuilder sb = new StringBuilder();
        String longest = str1.length() > limit ? str1 : str2;

        for (int i = 0; i < limit; i++) {
            sb.append(longest.charAt(i));
            if (str1.charAt(i) != str2.charAt(i)) {
                return "";
            }
            if (str1.length() % (i + 1) == 0 && str2.length() % (i + 1) == 0) {
                boolean isOk = true;
                String tmp = str1.substring(0, i + 1);
                for (int j = 0; j < longest.length(); j++) {
                    if (longest.charAt(j) != tmp.charAt(j % tmp.length())) {
                        isOk = false;
                        break;
                    }
                }
                if (isOk) {
                    divisor = tmp;
                }
            }
        }

        return divisor;
    }

}
