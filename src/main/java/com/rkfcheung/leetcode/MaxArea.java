package com.rkfcheung.leetcode;

/*
11. Container With Most Water https://leetcode.com/problems/container-with-most-water/
*/
public class MaxArea {
    public int maxArea(int[] height) {
        if (height == null || height.length <= 1) {
            return 0;
        }

        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while (i < j) {
            int a = height[i];
            int b = height[j];
            int area = (j - i) * Math.min(a, b);
            if (area > maxArea) {
                maxArea = area;
            }

            if (a < b) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }
}
