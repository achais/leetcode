package com.achais.leetcode.offer;

class ListNode25 {
    int val;
    ListNode25 next;

    ListNode25(int x) {
        val = x;
    }
}

public class Solution25 {
    public ListNode25 mergeTwoLists(ListNode25 l1, ListNode25 l2) {
        //先创建一个 val 为 0 的链表
        ListNode25 head = new ListNode25(0);
        ListNode25 cur = head;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = l1 != null ? l1 : l2;

        //去除第一个创建的 0
        return head.next;
    }

    public static void main(String[] args) {
        ListNode25 l1 = new ListNode25(1);
        ListNode25 l2 = new ListNode25(2);

        Solution25 solution = new Solution25();
        ListNode25 stdout = solution.mergeTwoLists(l1, l2);

        System.out.println(stdout);
    }
}
