package com.rkfcheung.leetcode

import java.util.*

/**
 * 225. Implement Stack using Queues https://leetcode.com/problems/implement-stack-using-queues/
 */
class MyStack {

    private val queue = LinkedList<Int>()

    fun push(x: Int) {
        queue.offer(x)
        transfer()
    }

    fun pop(): Int {
        return queue.poll()
    }

    fun top(): Int {
        return queue.peek()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }

    private fun transfer() {
        repeat(queue.size - 1) {
            queue.offer(queue.poll())
        }
    }
}