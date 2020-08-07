package com.achais.leetcode;

class TreeNode104 {
    int val;
    TreeNode104 left;
    TreeNode104 right;

    TreeNode104(int x) {
        val = x;
    }
}

public class Solution104 {
    public int maxDepth(TreeNode104 root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode104 node = new TreeNode104(2);

        Solution104 solution = new Solution104();
        Integer stdout = solution.maxDepth(node);

        System.out.println(stdout);
    }
}
