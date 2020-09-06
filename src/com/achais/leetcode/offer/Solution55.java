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
    /*
    第二道 解法2, 剪枝
     */
    public boolean isBalanced(TreeNode55 root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode55 root) {
        if (root == null) {
            return 0;
        }
        int left = recur(root.left);
        if (left == -1) {
            return -1;
        }
        int right = recur(root.right);
        if (right == -1) {
            return -1;
        }
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

    /*
    第二道 解法1, 判断子树深度差小于1
     */
    public boolean isBalanced1(TreeNode55 root) {
        if (root == null) {
            return true;
        }
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    /*
    第一道
     */
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
