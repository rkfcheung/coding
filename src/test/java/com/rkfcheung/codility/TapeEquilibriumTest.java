package com.rkfcheung.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {

    private final TapeEquilibrium solution = new TapeEquilibrium();

    @Test
    void should_find_min_diff() {
        assertEquals(1, solution.solution(new int[]{3, 1, 2, 4, 3}));
    }
}