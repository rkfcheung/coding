package com.rkfcheung.leetcode

import kotlin.math.absoluteValue
import kotlin.math.max

/*
110. Balanced Binary Tree https://leetcode.com/problems/balanced-binary-tree/
 */
class BalancedBinaryTree {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }

        val left = height(root.left)
        val right = height(root.right)
        if ((left - right).absoluteValue > 1) {
            return false
        }

        return isBalanced(root.left) && isBalanced(root.right)
    }

    private fun height(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        return max(height(root.left), height(root.right)) + 1
    }
}