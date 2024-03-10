package com.rkfcheung.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CyclicRotationTest {

    private final CyclicRotation solution = new CyclicRotation();

    @Test
    void should_rotate_cyclic() {
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, solution.solution(new int[]{3, 8, 9, 7, 6}, 3));

        assertArrayEquals(new int[]{0, 0, 0}, solution.solution(new int[]{0, 0, 0}, 1));

        assertArrayEquals(new int[]{1, 2, 3, 4}, solution.solution(new int[]{1, 2, 3, 4}, 4));
    }
}