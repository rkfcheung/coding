package com.rkfcheung.leetcode

import java.util.*

/*
206. Reverse Linked List https://leetcode.com/problems/reverse-linked-list/
 */
class ReverseLinkedList {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        val stack = Stack<ListNode>()
        var current = head
        while (current != null) {
            stack.push(current)
            current = current.next
        }

        val dummy = ListNode()
        current = dummy
        while (stack.isNotEmpty()) {
            val node = stack.pop()
            node?.next = null
            current?.next = node
            current = current?.next
        }

        return dummy.next
    }

    fun reverseList2(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        var prev: ListNode? = null
        var curr = head
        while (curr != null) {
            val next = curr.next
            curr.next = prev

            prev = curr
            curr = next
        }

        return prev
    }
}