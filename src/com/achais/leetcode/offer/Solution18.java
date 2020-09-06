package com.achais.leetcode.offer;

class ListNode18 {
    int val;
    ListNode18 next;

    ListNode18(int x) {
        val = x;
    }
}

public class Solution18 {
    public ListNode18 deleteNode(ListNode18 head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }

        ListNode18 cur = head;
        while (cur.next != null && cur.next.val != val) {
            cur = cur.next;
        }

        if (cur.next != null) {
            cur.next = cur.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode18 head = new ListNode18(1);
        int val = 2;

        Solution18 solution = new Solution18();
        ListNode18 stdout = solution.deleteNode(head, val);

        System.out.println(stdout);
    }
}
