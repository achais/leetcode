package com.achais.leetcode;

class TreeNode897 {
    int val;
    TreeNode897 left;
    TreeNode897 right;

    TreeNode897(int x) {
        val = x;
    }
}

public class Solution897 {
    TreeNode897 node;

    public TreeNode897 increasingBST(TreeNode897 root) {
        search(root);
        return node;
    }

    public void search(TreeNode897 root) {
        if (root == null) {
            return;
        }
        search(root.left);
        if (node == null) {
            node = new TreeNode897(root.val);
        } else {
            TreeNode897 cur = node;
            while (cur.right != null) {
                cur = cur.right;
            }
            cur.right = new TreeNode897(root.val);
        }
        search(root.right);
    }

    public static void main(String[] args) {
        TreeNode897 node = new TreeNode897(2);

        Solution897 solution = new Solution897();
        TreeNode897 stdout = solution.increasingBST(node);

        System.out.println(stdout.val);
    }
}
