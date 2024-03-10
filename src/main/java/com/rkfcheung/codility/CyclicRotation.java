package com.rkfcheung.codility;

/*
Cyclic Rotation https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
*/
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        if (A == null || A.length == 0 || K <= 0) {
            return A;
        }

        int n = A.length;
        int r = K % n;
        if (r == 0) {
            return A;
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + r) % n] = A[i];
        }

        return result;
    }
}
