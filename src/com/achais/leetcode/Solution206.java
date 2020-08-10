package com.achais.leetcode;

class ListNode206 {
    int val;
    ListNode206 next;

    ListNode206(int x) {
        val = x;
    }
}

public class Solution206 {
    /**
     * 递归
     */
    public ListNode206 reverseList(ListNode206 head) {
        if (head == null || head.next == null) return head;
        ListNode206 p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    /**
     * 迭代
     */
    public ListNode206 reverseList2(ListNode206 head) {
        ListNode206 prev = null;
        ListNode206 curr = head;
        while (curr != null) {
            ListNode206 nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode206 head = new ListNode206(2);

        Solution206 solution = new Solution206();
        ListNode206 stdout = solution.reverseList(head);

        System.out.println(stdout);
    }
}
