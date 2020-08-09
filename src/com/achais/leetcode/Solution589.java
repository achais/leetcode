package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

class Node589 {
    public int val;
    public List<Node589> children;

    public Node589() {
    }

    public Node589(int _val) {
        val = _val;
    }

    public Node589(int _val, List<Node589> _children) {
        val = _val;
        children = _children;
    }
};

public class Solution589 {
    public List<Integer> ans = new ArrayList<>();

    public List<Integer> preorder(Node589 root) {
        endSearch(root);
        return ans;
    }

    public void endSearch(Node589 node) {
        if (node == null) {
            return;
        }

        ans.add(node.val);

        for (Node589 child : node.children) {
            endSearch(child);
        }
    }

    public static void main(String[] args) {
        Node589 node = new Node589(1);

        Solution589 solution = new Solution589();
        List<Integer> stdout = solution.preorder(node);

        System.out.println(stdout);
    }
}
