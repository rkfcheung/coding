package com.rkfcheung.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationMissingElementTest {

    private final PermutationMissingElement solution = new PermutationMissingElement();

    @Test
    void should_find_missing_one() {
        assertEquals(4, solution.solution(new int[]{2, 3, 1, 5}));
    }
}