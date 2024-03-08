package com.rkfcheung.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrStrTest {

    private final StrStr solution = new StrStr();

    @ParameterizedTest
    @CsvSource({
            "0,sadbutsad,sad",
            "-1,leetcode,leeto",
            "4,mississippi,issip",
    })
    void should_find_first_occurrence(int expected, String haystack, String needle) {
        assertEquals(expected, solution.strStr(haystack, needle));
    }
}