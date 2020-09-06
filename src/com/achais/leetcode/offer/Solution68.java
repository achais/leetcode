package com.achais.leetcode.offer;

class TreeNode68 {
    int val;
    TreeNode68 left;
    TreeNode68 right;

    TreeNode68(int x) {
        val = x;
    }
}

public class Solution68 {
    /*
    二叉搜索树
     */
    public TreeNode68 lowestCommonAncestor(TreeNode68 root, TreeNode68 p, TreeNode68 q) {
        TreeNode68 left, right;
        if (p.val < q.val) {
            left = p;
            right = q;
        } else {
            left = q;
            right = p;
        }

        while (!(left.val < root.val && right.val > root.val)) {
            if (left.val > root.val) {
                root = root.right;
            } else if (right.val < root.val) {
                root = root.left;
            } else {
                break;
            }
        }

        return root;
    }

    public TreeNode68 lowestCommonAncestor2(TreeNode68 root, TreeNode68 p, TreeNode68 q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode68 left = lowestCommonAncestor(root.left, p, q);
        TreeNode68 right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode68 root = new TreeNode68(1);
        TreeNode68 p = new TreeNode68(1);
        TreeNode68 q = new TreeNode68(1);

        Solution68 solution = new Solution68();
        TreeNode68 stdout = solution.lowestCommonAncestor(root, p, q);

        System.out.println(stdout);
    }
}
