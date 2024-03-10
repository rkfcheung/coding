package com.rkfcheung.codility;

/*
Binary Gap https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
*/
public class BinaryGap {
    public int solution(int N) {
        // Implement your solution here
        var binStr = Integer.toBinaryString(N);
        int maxGap = 0;
        int curGap = 0;
        for (int i=0; i < binStr.length(); i++) {
            char c = binStr.charAt(i);
            if (c == '1') {
                maxGap = Math.max(maxGap, curGap);
                curGap = 0;
            } else {
                curGap++;
            }
        }

        return maxGap;
    }
}
