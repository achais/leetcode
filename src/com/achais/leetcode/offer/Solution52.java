package com.achais.leetcode.offer;

class ListNode52 {
    int val;
    ListNode52 next;

    ListNode52(int x) {
        val = x;
        next = null;
    }
}

public class Solution52 {
    public ListNode52 getIntersectionNode(ListNode52 headA, ListNode52 headB) {
        int headALen = headLength(headA);
        int headBLen = headLength(headB);
        while (headALen != headBLen) {
            if (headALen < headBLen) {
                headB = headB.next;
                headBLen--;
            } else {
                headA = headA.next;
                headALen--;
            }
        }

        while (headA != headB && headA.next != null && headB.next != null) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA == headB ? headA : null;
    }

    public int headLength(ListNode52 head) {
        int len = 0;
        ListNode52 cur = head;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        ListNode52 headA = new ListNode52(1);
        ListNode52 headB = new ListNode52(1);

        Solution52 solution = new Solution52();
        ListNode52 stdout = solution.getIntersectionNode(headA, headB);

        System.out.println(stdout.val);
    }
}
