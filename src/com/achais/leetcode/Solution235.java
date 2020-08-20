package com.achais.leetcode;

class TreeNode235 {
    int val;
    TreeNode235 left;
    TreeNode235 right;

    TreeNode235(int x) {
        val = x;
    }
}

public class Solution235 {
    public TreeNode235 lowestCommonAncestor(TreeNode235 root, TreeNode235 p, TreeNode235 q) {
        while (true) {
            if ((p.val < root.val && q.val > root.val) || (p.val > root.val && q.val < root.val) || root.val == p.val || root.val == q.val)  {
                return root;
            } else if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode235 root = new TreeNode235(1);
        TreeNode235 p = new TreeNode235(2);
        TreeNode235 q = new TreeNode235(3);

        Solution235 solution = new Solution235();
        TreeNode235 stdout = solution.lowestCommonAncestor(root, p, q);

        System.out.println(stdout);
    }
}
