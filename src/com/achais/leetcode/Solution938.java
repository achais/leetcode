package com.achais.leetcode;

class TreeNode938 {
    int val;
    TreeNode938 left;
    TreeNode938 right;

    TreeNode938(int x) {
        val = x;
    }
}

public class Solution938 {
    int ans;

    /**
     * 递归实现深度优先搜索
     */
    public int rangeSumBST(TreeNode938 root, int L, int R) {
        ans = 0;
        dfs(root, L, R);
        return ans;
    }

    public void dfs(TreeNode938 node, int L, int R) {
        if (node != null) {
            if (L <= node.val && node.val <= R)
                ans += node.val;
            if (L < node.val)
                dfs(node.left, L, R);
            if (node.val < R)
                dfs(node.right, L, R);
        }
    }

    public static void main(String[] args) {
        TreeNode938 root = new TreeNode938(1);
        int L = 7;
        int R = 15;

        Solution938 solution = new Solution938();
        Integer stdout = solution.rangeSumBST(root, L, R);

        System.out.println(stdout);
    }
}
