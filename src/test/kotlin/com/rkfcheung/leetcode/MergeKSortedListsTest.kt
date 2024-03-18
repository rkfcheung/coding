package com.rkfcheung.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MergeKSortedListsTest {

    private val solution = MergeKSortedLists()

    @Test
    fun should_merge_k_lists() {
        assertNull(solution.mergeKLists(emptyArray()))
        assertNull(solution.mergeKLists2(emptyArray()))

        assertNull(solution.mergeKLists(arrayOf(null)))
        assertNull(solution.mergeKLists2(emptyArray()))

        assertEquals(
            ListNode.of("1,1,2,3,4,4,5,6"),
            solution.mergeKLists(
                arrayOf(
                    ListNode.of("1,4,5"),
                    ListNode.of("1,3,4"),
                    ListNode.of("2,6")
                )
            )
        )
        assertEquals(
            ListNode.of("1,1,2,3,4,4,5,6"),
            solution.mergeKLists2(
                arrayOf(
                    ListNode.of("1,4,5"),
                    ListNode.of("1,3,4"),
                    ListNode.of("2,6")
                )
            )
        )
    }
}