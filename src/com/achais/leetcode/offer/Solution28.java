package com.achais.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

class TreeNode28 {
    int val;
    TreeNode28 left;
    TreeNode28 right;

    TreeNode28(int x) {
        val = x;
    }
}

public class Solution28 {
    /*
    解法2
     */
    public boolean isSymmetric(TreeNode28 root) {
        return root == null || recur(root.left, root.right);
    }

    public boolean recur(TreeNode28 L, TreeNode28 R){
        if (L == null && R == null) {
            return true;
        }
        if (L == null || R == null || L.val != R.val) {
            return false;
        }
        return recur(L.left, R.right) && recur(L.right, R.left);
    }

    /*
    解法1
     */
    public boolean isSymmetric1(TreeNode28 root) {
        List<Integer> l1 = new ArrayList<>();
        DFS(root, l1);

        rev(root);

        List<Integer> l2 = new ArrayList<>();
        DFS(root, l2);

        return l1.equals(l2);
    }

    public void rev(TreeNode28 root) {
        if (root != null) {
            TreeNode28 t;
            t = root.left;
            root.left = root.right;
            root.right = t;

            rev(root.left);
            rev(root.right);
        }
    }

    public void DFS(TreeNode28 root, List<Integer> l1) {
        if (root != null) {
            DFS(root.left, l1);
            l1.add(root.val);
            DFS(root.right, l1);
        } else {
            l1.add(null);
        }
    }

    public static void main(String[] args) {
        TreeNode28 root = new TreeNode28(1);

        Solution28 solution = new Solution28();
        boolean stdout = solution.isSymmetric(root);

        System.out.println(stdout);
    }
}
