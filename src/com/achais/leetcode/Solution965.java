package com.achais.leetcode;

class TreeNode965 {
    int val;
    TreeNode965 left;
    TreeNode965 right;

    TreeNode965(int x) {
        val = x;
    }
}

public class Solution965 {
    public boolean isUnivalTree(TreeNode965 root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.val != root.val) {
            return false;
        }
        if (root.right != null && root.right.val != root.val) {
            return false;
        }

        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode965 root = new TreeNode965(2);

        Solution965 solution = new Solution965();
        boolean stdout = solution.isUnivalTree(root);

        System.out.println(stdout);
    }
}
