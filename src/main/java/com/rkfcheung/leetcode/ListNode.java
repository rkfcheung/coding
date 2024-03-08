package com.rkfcheung.leetcode;

import java.util.Optional;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return val + "," + Optional.ofNullable(next).map(ListNode::toString).orElse("");
    }
}
