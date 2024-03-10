package com.rkfcheung.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogJumpTest {

    private final FrogJump solution = new FrogJump();

    @Test
    void should_jump() {
        assertEquals(3, solution.solution(10, 85, 30));
    }
}