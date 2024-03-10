package com.rkfcheung.codility;

/*
Permutation Missing Element https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
*/
public class PermutationMissingElement {
    public int solution(int[] A) {
        // Implement your solution here
        if (A == null || A.length == 0) {
            return 1;
        }

        long n = A.length + 1L;
        long result = n * (n + 1L) / 2L;
        for (int i : A) {
            result -= i;
        }

        return (int) result;
    }
}
