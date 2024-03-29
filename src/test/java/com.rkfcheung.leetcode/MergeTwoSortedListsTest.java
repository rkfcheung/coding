package com.rkfcheung.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists solution = new MergeTwoSortedLists();

    @Test
    void should_merge_two_lists() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode merged = solution.mergeTwoLists(list1, list2);

        assertEquals(ListNode.of("1,1,2,3,4,4"), merged);
    }

    @Test
    void should_merge_with_empty_links() {
        assertNull(solution.mergeTwoLists(null, null));

        assertEquals(ListNode.of("2"), solution.mergeTwoLists(null, new ListNode(2)));
    }
}