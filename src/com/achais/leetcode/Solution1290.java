package com.achais.leetcode;

class ListNode1290 {
    int val;
    ListNode1290 next;

    ListNode1290(int x) {
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
public class Solution1290 {
    public int getDecimalValue(ListNode1290 head) {
        int ans = 0;
        while (head != null) {
            ans = 2 * ans + head.val;
            head = head.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode1290 node = new ListNode1290(1);

        Solution1290 solution = new Solution1290();
        Integer stdout = solution.getDecimalValue(node);

        System.out.println(stdout);
    }
}

/*
这道题疑虑了一下 要不要吧 head.val = head.next.val;
后来想了想链表数据结构和数据操作 应该只需要 head = head.next;
 */