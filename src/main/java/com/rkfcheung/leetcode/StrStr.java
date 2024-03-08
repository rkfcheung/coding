package com.rkfcheung.leetcode;

/*
28. Find the Index of the First Occurrence in a String https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
*/
public class StrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length()) {
            return -1;
        }

        int found = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(found)) {
                found++;
            } else {
                i -= found;
                found = 0;
            }

            if (found == needle.length()) {
                return i - needle.length() + 1;
            }
        }

        return -1;
    }
}
