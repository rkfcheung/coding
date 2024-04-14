package com.rkfcheung.codility;

/*
Passing Cars https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
 */
public class PassingCars {
    public int solution(int[] A) {
        // Implement your solution here
        if (A == null || A.length == 0) {
            return 0;
        }

        int result = 0;
        int east = 0;
        for (int i : A) {
            if (i == 0) {
                east++;
            } else {
                result += east;
                if (result > 1_000_000_000) {
                    return -1;
                }
            }
        }
        return result;
    }
}
