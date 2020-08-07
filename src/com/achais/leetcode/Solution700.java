package com.achais.leetcode;

class TreeNode700 {
    int val;
    TreeNode700 left;
    TreeNode700 right;

    TreeNode700(int x) {
        val = x;
    }
}

public class Solution700 {
    public TreeNode700 searchBST(TreeNode700 root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        return root.val < val ? searchBST(root.right, val) : searchBST(root.left, val);
    }

    public TreeNode700 searchBST2(TreeNode700 root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        TreeNode700 left = searchBST(root.left, val);
        if (left != null) {
            return left;
        }

        return searchBST(root.right, val);
    }

    public static void main(String[] args) {
        TreeNode700 node = new TreeNode700(2);
        int val = 2;

        Solution700 solution = new Solution700();
        TreeNode700 stdout = solution.searchBST(node, val);

        System.out.println(stdout);
    }
}
