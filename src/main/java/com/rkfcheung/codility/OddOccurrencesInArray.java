package com.rkfcheung.codility;

/*
3. Odd Occurrences In Array https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
*/
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // Implement your solution here
        if (A == null || A.length == 0) {
            return -1;
        }

        int result = 0;
        for (int i : A) {
            result ^= i;
        }

        return result;
    }
}
