package com.rkfcheung.leetcode

/*
102. Binary Tree Level Order Traversal https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
class BinaryTreeLevelOrderTraversal {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) {
            return emptyList()
        }

        val result = mutableListOf<List<Int>>()
        val queue = ArrayDeque<TreeNode>()
        queue += root
        while (queue.isNotEmpty()) {
            val currentLevel = mutableListOf<Int>()
            val size = queue.size
            repeat(size) {
                val node = queue.removeFirst()
                currentLevel += node.value

                node.left?.let { queue += it }
                node.right?.let { queue += it }
            }

            result += currentLevel
        }

        return result
    }
}