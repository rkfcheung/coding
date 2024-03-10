package com.rkfcheung.codility;

import java.util.HashSet;
import java.util.Set;

/*
Perm Check https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
*/
public class PermCheck {
    public int solution(int[] A) {
        // Implement your solution here
        if (A == null || A.length == 0) {
            return 0;
        }

        int n = A.length;
        Set<Integer> seen = new HashSet<>();
        for (int i : A) {
            if (i < 1 || i > n || seen.contains(i)) {
                return 0;
            }

            seen.add(i);
        }

        return 1;
    }
}
