package com.achais.leetcode;

class TreeNode669 {
    int val;
    TreeNode669 left;
    TreeNode669 right;

    TreeNode669(int x) {
        val = x;
    }
}

public class Solution669 {
    public TreeNode669 trimBST(TreeNode669 root, int L, int R) {
        if (root == null) {
            return null;
        }

        if (root.val < L) {
            return trimBST(root.right, L, R);
        }
        if (root.val > R) {
            return trimBST(root.left, L, R);
        }

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);

        return root;
    }

    public static void main(String[] args) {
        TreeNode669 root = new TreeNode669(2);
        int L = 1;
        int R = 2;

        Solution669 solution = new Solution669();
        TreeNode669 stdout = solution.trimBST(root, L, R);

        System.out.println(stdout);
    }
}
