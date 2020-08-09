package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

class Node590 {
    public int val;
    public List<Node590> children;

    public Node590() {
    }

    public Node590(int _val) {
        val = _val;
    }

    public Node590(int _val, List<Node590> _children) {
        val = _val;
        children = _children;
    }
};

public class Solution590 {
    public List<Integer> ans = new ArrayList<>();

    public List<Integer> postorder(Node590 root) {
        endSearch(root);
        return ans;
    }

    public void endSearch(Node590 node) {
        if (node == null) {
            return;
        }

        for (Node590 child : node.children) {
            endSearch(child);
        }

        ans.add(node.val);
    }

    public static void main(String[] args) {
        Node590 node = new Node590(1);

        Solution590 solution = new Solution590();
        List<Integer> stdout = solution.postorder(node);

        System.out.println(stdout);
    }
}
