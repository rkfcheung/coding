package com.rkfcheung.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermCheckTest {

    private final PermCheck solution = new PermCheck();

    @Test
    void should_check_perm() {
        assertEquals(1, solution.solution(new int[]{4, 1, 3, 2}));

        assertEquals(0, solution.solution(new int[]{4, 1, 3}));
    }
}