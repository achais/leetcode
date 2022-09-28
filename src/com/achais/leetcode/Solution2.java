package com.achais.leetcode;

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2() {}
    ListNode2(int val) {this.val = val; }
    ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}

public class Solution2 {
    public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        ListNode2 end = new ListNode2(0);
        ListNode2 node = new ListNode2(0);
        ListNode2 cur = node;
        int plus, value;
        do {
            value = l1.val + l2.val + cur.val;
            cur.val = value % 10;
            plus = value / 10;

            l1 = l1.next == null ? end : l1.next;
            l2 = l2.next == null ? end : l2.next;

            if (l1 != end || l2 != end || plus == 1) {
                cur.next = new ListNode2(plus);
                cur = cur.next;
            }
        } while (l1 != end || l2 != end);

        return node;
    }

    public static void main(String[] args) {

        ListNode2 l1 = new ListNode2(2);
        ListNode2 l2 = new ListNode2(6);

        Solution2 solution = new Solution2();
        ListNode2 stdout = solution.addTwoNumbers(l1, l2);

        System.out.println(stdout.val);
    }
}
