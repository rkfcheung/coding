package com.rkfcheung.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class HappyNumberTest {

    private val solution = HappyNumber()

    @ParameterizedTest
    @CsvSource("19", "82", "68", "100", "7")
    fun should_be_happy(n: Int) {
        assertTrue(solution.isHappy(n))
        assertTrue(solution.isHappy2(n))
    }

    @ParameterizedTest
    @CsvSource("2", "0")
    fun should_not_be_happy(n: Int) {
        assertFalse(solution.isHappy(n))
        assertFalse(solution.isHappy2(n))
    }
}