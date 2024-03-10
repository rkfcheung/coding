package com.rkfcheung.codility;

/*
Tape Equilibrium https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
*/
public class TapeEquilibrium {
    public int solution(int[] A) {
        // Implement your solution here
        if (A == null || A.length <= 1) {
            return 0;
        }

        int total = 0;
        for (int i : A) {
            total += i;
        }
        int left = A[0];
        int right = total - left;
        int minDiff = Math.abs(left - right);
        for (int i = 1; i < A.length - 1; i++) {
            int n = A[i];
            left += n;
            right -= n;
            minDiff = Math.min(minDiff, Math.abs(left - right));
        }

        return minDiff;
    }
}
