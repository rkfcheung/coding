package com.rkfcheung.codility;

/*
Max Counters https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
*/
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        // Implement your solution here
        if (A == null || A.length == 0 || N <= 0) {
            return A;
        }

        int[] result = new int[N];
        int maxCounter = 0;
        int currentMax = 0;
        for (int i : A) {
            if (i >= 1 && i <= N) {
                int currentValue = result[i - 1];
                result[i - 1] = Math.max(currentValue, maxCounter) + 1;
                currentMax = Math.max(currentMax, result[i - 1]);
            } else if (i == N + 1) {
                maxCounter = currentMax;
            }
        }
        for (int i = 0; i < N; i++) {
            result[i] = Math.max(maxCounter, result[i]);
        }

        return result;
    }
}
