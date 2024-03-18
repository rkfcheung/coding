package com.rkfcheung.leetcode

import java.util.PriorityQueue

/*
23. Merge k Sorted Lists https://leetcode.com/problems/merge-k-sorted-lists/
 */
class MergeKSortedLists {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) {
            return null
        }

        val queue = ArrayDeque<ListNode>()
        lists.forEach { node ->
            node?.let { queue += it }
        }
        if (queue.isEmpty()) {
            return null
        }

        while (queue.size >= 2) {
            val a = queue.removeFirst()
            val b = queue.removeFirst()
            merge(a, b)?.let { queue += it }
        }

        return queue.removeFirst()
    }

    fun mergeKLists2(lists: Array<ListNode?>): ListNode? {
        if (lists.size <= 1) {
            return lists.firstOrNull()
        }

        val pq = PriorityQueue<ListNode>(compareBy { it.value })
        lists.filterNot { it == null }.forEach { node ->
            pq += node
        }

        val dummy = ListNode()
        var current = dummy
        while (pq.isNotEmpty()) {
            val node = pq.poll()
            current.next = node
            current = current.next

            node.next?.let { pq += it }
        }

        return dummy.next
    }

    private fun merge(a: ListNode?, b: ListNode?): ListNode? {
        val dummy = ListNode()
        var current = dummy
        var node1 = a
        var node2 = b
        while (node1 != null && node2 != null) {
            val v1 = node1.value
            val v2 = node2.value
            if (v1 < v2) {
                current.next = node1
                node1 = node1.next
            } else {
                current.next = node2
                node2 = node2.next
            }

            current = current.next
        }

        if (node1 != null) {
            current.next = node1
        }

        if (node2 != null) {
            current.next = node2
        }

        return dummy.next
    }
}