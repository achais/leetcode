package com.achais.leetcode.offer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class ListNode06 {
    int val;
    ListNode06 next;

    ListNode06(int x) {
        val = x;
    }
}

public class Solution06 {
    public int[] reversePrint(ListNode06 head) {
        List<Integer> list = new LinkedList<>();
        helper(head, list);

        int[] ans = new int[list.size()];
        int index = 0;
        for (Integer integer : list) {
            ans[index++] = integer;
        }
        return ans;
    }

    public void helper(ListNode06 head, List<Integer> list) {
        if (head != null) {
            if (head.next != null) {
                helper(head.next, list);
            }
            list.add(head.val);
        }
    }

    public static void main(String[] args) {
        ListNode06 head = new ListNode06(1);

        Solution06 solution = new Solution06();
        int[] stdout = solution.reversePrint(head);

        System.out.println(Arrays.toString(stdout));
    }
}
