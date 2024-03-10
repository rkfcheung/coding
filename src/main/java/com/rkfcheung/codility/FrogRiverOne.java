package com.rkfcheung.codility;

import java.util.HashSet;
import java.util.Set;

/*
Frog River One https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
*/
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // Implement your solution here
        if (X <= 0 || A == null || A.length == 0) {
            return -1;
        }

        Set<Integer> positions = new HashSet<>();
        int covered = 0;
        for (int i = 0; i < A.length; i++) {
            int n = A[i];
            if (!positions.contains(n)) {
                positions.add((n));
                covered++;
            }

            if (covered == X) {
                return i;
            }
        }

        return -1;
    }
}
