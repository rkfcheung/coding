package com.rkfcheung.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAreaTest {

    private final MaxArea solution = new MaxArea();

    @Test
    void should_container_with_most_water() {
        assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));

        assertEquals(1, solution.maxArea(new int[]{1, 1}));
    }
}