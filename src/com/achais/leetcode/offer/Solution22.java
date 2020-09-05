package com.achais.leetcode.offer;

class ListNode22 {
    int val;
    ListNode22 next;

    ListNode22(int x) {
        val = x;
    }
}

public class Solution22 {
    public ListNode22 getKthFromEnd(ListNode22 head, int k) {
        while (childrenLength(head) != k - 1) {
            head = head.next;
        }
        return head;
    }

    public int childrenLength(ListNode22 head) {
        if (head.next == null) {
            return 0;
        }

        return childrenLength(head.next) + 1;
    }

    public static void main(String[] args) {
        ListNode22 head = new ListNode22(2);
        int k = 1;

        Solution22 solution = new Solution22();
        ListNode22 stdout = solution.getKthFromEnd(head, k);

        System.out.println(stdout);
    }
}
