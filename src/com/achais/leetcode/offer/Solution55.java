package com.achais.leetcode.offer;

class TreeNode55 {
    int val;
    TreeNode55 left;
    TreeNode55 right;

    TreeNode55(int x) {
        val = x;
    }
}

public class Solution55 {
    public int maxDepth(TreeNode55 root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode55 root = new TreeNode55(2);

        Solution55 solution = new Solution55();
        Integer stdout = solution.maxDepth(root);

        System.out.println(stdout);
    }
}
