package com.rkfcheung.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthFromEndTest {

    private final RemoveNthFromEnd solution = new RemoveNthFromEnd();

    @Test
    void should_remove_nth_from_end() {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 5; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        ListNode removed = solution.removeNthFromEnd(head, 2);

        assertEquals(ListNode.of("1,2,3,5,"), removed);
    }

    @Test
    void should_remove_singe_value() {
        assertNull(solution.removeNthFromEnd(new ListNode(1), 1));

        assertEquals(new ListNode(1), solution.removeNthFromEnd(new ListNode(1, new ListNode(2)), 1));

        assertEquals(new ListNode(2), solution.removeNthFromEnd(new ListNode(1, new ListNode(2)), 2));
    }
}