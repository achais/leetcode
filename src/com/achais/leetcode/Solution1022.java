package com.achais.leetcode;

class TreeNode1022 {
    int val;
    TreeNode1022 left;
    TreeNode1022 right;

    TreeNode1022(int x) {
        val = x;
    }
}

public class Solution1022 {
    int ans = 0;
    int mod = 1000000000 + 7;

    public int sumRootToLeaf(TreeNode1022 root) {
        helper(root, 0);
        return ans % mod;
    }

    public void helper(TreeNode1022 root, int sum) {
        if (root != null) {
            sum = ((sum << 1) + root.val);
            if (root.left == null && root.right == null) {
                ans += sum;
            } else {
                helper(root.left, sum);
                helper(root.right, sum);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode1022 root = new TreeNode1022(1);

        Solution1022 solution = new Solution1022();
        Integer stdout = solution.sumRootToLeaf(root);

        System.out.println(stdout);
    }
}
