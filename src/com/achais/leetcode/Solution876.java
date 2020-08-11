package com.achais.leetcode;

import java.util.List;

class ListNode876 {
    int val;
    ListNode876 next;

    ListNode876(int x) {
        val = x;
    }
}

public class Solution876 {
    public ListNode876 middleNode(ListNode876 head) {
        int len = 1;
        ListNode876 temp = head;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        ListNode876 ans = head;
        int middle = len / 2 + 1;
        while (--middle > 0 && ans != null) {
            ans = ans.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode876 head = new ListNode876(2);

        Solution876 solution = new Solution876();
        ListNode876 stdout = solution.middleNode(head);

        System.out.println(stdout);
    }
}
