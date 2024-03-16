package com.rkfcheung.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MyStackTest {

    private val stack = MyStack()

    @Test
    fun should_stack() {
        stack.push(1)
        stack.push(2)
        assertEquals(2, stack.top())
        assertEquals(2, stack.pop())
        assertFalse(stack.empty())
    }
}