package com.rkfcheung.codility;

import java.util.HashSet;
import java.util.Set;

/*
Missing Integer https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
*/
public class MissingInteger {
    public int solution(int[] A) {
        // Implement your solution here
        if (A == null || A.length == 0) {
            return 1;
        }

        Set<Integer> seen = new HashSet<>();
        for (int i : A) {
            seen.add(i);
        }
        int missing = 1;
        while (seen.contains(missing)) {
            missing++;
        }

        return missing;
    }
}
