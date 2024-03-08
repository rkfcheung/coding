package com.rkfcheung.leetcode;

/*
19. Remove Nth Node From End of List https://leetcode.com/problems/remove-nth-node-from-end-of-list/
*/
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode slow = dummy;

        while (n >= 0) {
            fast = fast.next;
            n--;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
}
