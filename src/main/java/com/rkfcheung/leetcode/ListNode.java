package com.rkfcheung.leetcode;

import java.util.Objects;
import java.util.Optional;

public class ListNode {
    int value;
    ListNode next;

    ListNode() {
    }

    ListNode(int value) {
        this.value = value;
    }

    ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public static ListNode of(String values) {
        if (values == null || values.isBlank()) {
            return null;
        }

        var nodes = values.split(",");
        var dummy = new ListNode();
        var current = dummy;
        for (var node : nodes) {
            current.next = new ListNode(Integer.parseInt(node));
            current = current.next;
        }

        return dummy.next;
    }

    @Override
    public String toString() {
        var nextValue = Optional.ofNullable(next).map(ListNode::toString).orElse("");

        return value + (nextValue.isBlank() ? "" : ",") + nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode node = (ListNode) o;
        return value == node.value && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }
}
