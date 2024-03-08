package com.rkfcheung.leetcode;

/*
14. Longest Common Prefix https://leetcode.com/problems/longest-common-prefix/
*/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                String str = strs[j];
                if (i >= str.length() || c != str.charAt(i)) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}
