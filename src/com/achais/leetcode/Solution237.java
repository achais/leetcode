package com.achais.leetcode;

class ListNode237 {
    int val;
    ListNode237 next;

    ListNode237(int x) {
        val = x;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution237 {
    public void deleteNode(ListNode237 node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode237 node = new ListNode237(1);

        Solution237 solution = new Solution237();
        solution.deleteNode(node);
    }
}
