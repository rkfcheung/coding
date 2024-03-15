package com.rkfcheung.leetcode

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class BalancedBinaryTreeTest {

    private val solution = BalancedBinaryTree()

    @Test
    fun should_be_balanced() {
        val root = TreeNode(
            3,
            TreeNode(9),
            TreeNode(
                20,
                TreeNode(15),
                TreeNode(7)
            )
        )
        assertTrue(solution.isBalanced(root))
    }

    @Test
    fun should_not_be_balanced() {
        val root = TreeNode(
            1,
            TreeNode(
                2,
                TreeNode(
                    3,
                    TreeNode(4),
                    TreeNode(4)
                ),
                TreeNode(3)
            ),
            TreeNode(2)
        )
        assertFalse(solution.isBalanced(root))

        val root2 = TreeNode(
            1,
            TreeNode(
                2,
                TreeNode(
                    3,
                    TreeNode(4)
                )
            ),
            TreeNode(
                2,
                null,
                TreeNode(
                    3,
                    null,
                    TreeNode(4)
                )
            )
        )
        assertFalse(solution.isBalanced(root2))
    }
}