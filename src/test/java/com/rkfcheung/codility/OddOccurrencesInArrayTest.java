package com.rkfcheung.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurrencesInArrayTest {

    private final OddOccurrencesInArray solution = new OddOccurrencesInArray();

    @Test
    void should_find_odd_occurrence() {
        assertEquals(7, solution.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

}