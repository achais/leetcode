package com.achais.leetcode;

 class ListNode160 {
    int val;
    ListNode160 next;
    ListNode160(int x) {
        val = x;
        next = null;
    }
}

public class Solution160 {
    public ListNode160 getIntersectionNode(ListNode160 headA, ListNode160 headB) {
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

    public int headLength(ListNode160 head) {
        int len = 0;
        ListNode160 cur = head;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        ListNode160 root = new ListNode160(1);

        Solution160 solution = new Solution160();
        ListNode160 stdout = solution.getIntersectionNode(root, root);

        System.out.println(stdout);
    }
}
