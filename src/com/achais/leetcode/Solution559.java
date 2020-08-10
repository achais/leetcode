package com.achais.leetcode;

import java.util.List;

class Node559 {
    public int val;
    public List<Node559> children;

    public Node559() {
    }

    public Node559(int _val) {
        val = _val;
    }

    public Node559(int _val, List<Node559> _children) {
        val = _val;
        children = _children;
    }
};

public class Solution559 {
    public int maxDepth(Node559 root) {
        if (root == null) return 0;
        int depth = 1;
        for (Node559 child : root.children) {
            depth = Math.max(maxDepth(child) + 1, depth);
        }
        return depth;
    }

    public static void main(String[] args) {
        Node559 node = new Node559(2);

        Solution559 solution = new Solution559();
        Integer stdout = solution.maxDepth(node);

        System.out.println(stdout);
    }
}
