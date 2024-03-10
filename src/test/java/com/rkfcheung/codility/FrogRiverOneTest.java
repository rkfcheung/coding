package com.rkfcheung.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {

    private final FrogRiverOne solution = new FrogRiverOne();

    @Test
    void should_jump_over() {
        assertEquals(6, solution.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }
}