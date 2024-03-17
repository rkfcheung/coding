package com.rkfcheung.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BinaryTreeLevelOrderTraversalTest {

    private val solution = BinaryTreeLevelOrderTraversal()

    @Test
    fun should_give_level_order() {
        assertEquals(
            listOf(listOf(3), listOf(9, 20), listOf(15, 7)),
            solution.levelOrder(
                TreeNode(
                    3,
                    TreeNode(9),
                    TreeNode(
                        20,
                        TreeNode(15),
                        TreeNode(7)
                    )
                )
            )
        )

        assertEquals(listOf(listOf(3)), solution.levelOrder(TreeNode(1)))

        assertTrue(solution.levelOrder(null).isEmpty())
    }
}