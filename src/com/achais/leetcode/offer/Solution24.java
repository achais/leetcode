package com.achais.leetcode.offer;

import java.util.LinkedList;
import java.util.List;

class ListNode24 {
    int val;
    ListNode24 next;

    ListNode24(int x) {
        val = x;
    }
}

public class Solution24 {
    public ListNode24 reverseList(ListNode24 head) {
        //新的链表
        ListNode24 newHead = null;
        while (head != null) {
            //临时保存 next
            ListNode24 temp = head.next;
            //把新的"链表头"连在 head.next 后面
            head.next = newHead;
            //这时候新的"链表头"就是 head 了
            newHead = head;

            //继续下一个循环, head 肯定要赋值为原来 head.next 即 temp 的, while 循环嘛
            head = temp;
        }
        return newHead;
    }

    public ListNode24 reverseList2(ListNode24 head) {
        List<Integer> list = new LinkedList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        ListNode24 root = null;
        if (!list.isEmpty()) {
            root = new ListNode24(list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }

        ListNode24 curr = root;
        while (!list.isEmpty()) {
            curr.next = new ListNode24(list.get(list.size() - 1));
            list.remove(list.size() - 1);
            curr = curr.next;
        }
        return root;
    }

    public static void main(String[] args) {
        ListNode24 head = new ListNode24(1);

        Solution24 solution = new Solution24();
        ListNode24 stdout = solution.reverseList(head);

        System.out.println(stdout);
    }
}
