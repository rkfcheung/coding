package com.rkfcheung.codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryGapTest {

    private final BinaryGap solution = new BinaryGap();

    @ParameterizedTest
    @CsvSource({
            "2,9",
            "4,529",
            "0,15",
            "0,32",
            "28,1610612737",
    })
    void should_find_max_binary_gap(int expected, int n) {
        assertEquals(expected, solution.solution(n));
    }
}