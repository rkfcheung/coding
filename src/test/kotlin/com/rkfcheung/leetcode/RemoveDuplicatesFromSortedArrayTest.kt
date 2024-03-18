package com.rkfcheung.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class RemoveDuplicatesFromSortedArrayTest {

    private val solution = RemoveDuplicatesFromSortedArray()

    @Test
    fun should_remove_duplicates() {
        val nums1 = intArrayOf(1, 1, 2)
        assertEquals(intArrayOf(1, 2), nums1, solution.removeDuplicates(nums1))

        val nums2 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        assertEquals(intArrayOf(0, 1, 2, 3, 4), nums2, solution.removeDuplicates(nums2))
    }

    private fun assertEquals(expected: IntArray, actual: IntArray, uniqueNums: Int) {
        assertEquals(expected.size, uniqueNums)
        assertArrayEquals(expected, actual.copyOf(uniqueNums))
    }
}