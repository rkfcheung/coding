package com.rkfcheung.leetcode;

/*
21. Merge Two Sorted Lists https://leetcode.com/problems/merge-two-sorted-lists/
*/
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode head = new ListNode();
        ListNode dummy = head;
        while (list1 != null && list2 != null) {
            int v1 = list1.val;
            int v2 = list2.val;
            if (v1 < v2) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }

        if (list1 != null) {
            head.next = list1;
        }

        if (list2 != null) {
            head.next = list2;
        }

        return dummy.next;
    }
}
