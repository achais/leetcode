package com.achais.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

class Node35 {
    int val;
    Node35 next;
    Node35 random;

    public Node35(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Solution35 {
    public Node35 copyRandomList(Node35 head) {
        Map<Node35, Node35> map = new HashMap<>();

        Node35 cur = head;
        while (cur != null) {
            map.put(cur, new Node35(cur.val));
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }

    public static void main(String[] args) {

    }
}
