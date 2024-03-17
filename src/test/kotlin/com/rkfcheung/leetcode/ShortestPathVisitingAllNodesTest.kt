package com.rkfcheung.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ShortestPathVisitingAllNodesTest {

    private val solution = ShortestPathVisitingAllNodes()

    @Test
    fun should_find_the_shortest_path_length() {
        assertEquals(-1, solution.shortestPathLength(emptyArray()))

        assertEquals(
            4,
            solution.shortestPathLength(arrayOf(intArrayOf(1, 2, 3), intArrayOf(0), intArrayOf(0), intArrayOf(0)))
        )

        assertEquals(
            4,
            solution.shortestPathLength(
                arrayOf(
                    intArrayOf(1),
                    intArrayOf(0, 2, 4),
                    intArrayOf(1, 3, 4),
                    intArrayOf(2),
                    intArrayOf(1, 2)
                )
            )
        )
    }
}