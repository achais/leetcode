package com.achais.leetcode.offer;

class TreeNode27 {
    int val;
    TreeNode27 left;
    TreeNode27 right;

    TreeNode27(int x) {
        val = x;
    }
}

public class Solution27 {
    public TreeNode27 mirrorTree(TreeNode27 root) {
        if (root == null) {
            return null;
        }

        TreeNode27 temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }

    public static void main(String[] args) {
        TreeNode27 root = new TreeNode27(2);

        Solution27 solution = new Solution27();
        TreeNode27 stdout = solution.mirrorTree(root);

        System.out.println(stdout);
    }
}
