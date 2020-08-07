package com.achais.leetcode;

class TreeNode226 {
    int val;
    TreeNode226 left;
    TreeNode226 right;

    TreeNode226(int x) {
        val = x;
    }
}

public class Solution226 {
    public TreeNode226 invertTree(TreeNode226 root) {
        if (root == null) {
            return null;
        }

        TreeNode226 temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    public static void main(String[] args) {
        TreeNode226 node = new TreeNode226(1);

        Solution226 solution = new Solution226();
        TreeNode226 stdout = solution.invertTree(node);

        System.out.println(stdout);
    }
}
