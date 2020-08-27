package com.achais.leetcode;

class TreeNode538 {
    int val;
    TreeNode538 left;
    TreeNode538 right;

    TreeNode538(int x) {
        val = x;
    }
}

public class Solution538 {
    private int sum = 0;

    public TreeNode538 convertBST(TreeNode538 root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode538 root = new TreeNode538(2);

        Solution538 solution = new Solution538();
        TreeNode538 stdout = solution.convertBST(root);

        System.out.println(stdout);
    }
}
