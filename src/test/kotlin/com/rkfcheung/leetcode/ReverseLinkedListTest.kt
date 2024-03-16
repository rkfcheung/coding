package com.rkfcheung.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ReverseLinkedListTest {

    private val solution = ReverseLinkedList()

    @Test
    fun should_reverse_list() {
        val before1 = ListNode(
            1,
            ListNode(
                2,
                ListNode(
                    3,
                    ListNode(
                        4,
                        ListNode(5)
                    )
                )
            )
        )
        val copied1 = ListNode.of(before1.toString())
        val after1 = ListNode(
            5,
            ListNode(
                4,
                ListNode(
                    3,
                    ListNode(
                        2,
                        ListNode(1)
                    )
                )
            )
        )
        assertEquals(after1, solution.reverseList(before1))
        assertEquals(after1, solution.reverseList2(copied1))

        val before2 = ListNode(1, ListNode(2))
        val copied2 = ListNode.of(before2.toString())
        val after2 = ListNode(2, ListNode(1))
        assertEquals(after2, solution.reverseList(before2))
        assertEquals(after2, solution.reverseList2(copied2))
    }
}