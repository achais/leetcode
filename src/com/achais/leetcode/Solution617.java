package com.achais.leetcode;

class TreeNode617 {
    int val;
    TreeNode617 left;
    TreeNode617 right;

    TreeNode617(int x) {
        val = x;
    }
}

public class Solution617 {
    public TreeNode617 mergeTrees(TreeNode617 t1, TreeNode617 t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    public static void main(String[] args) {
        TreeNode617 t1 = new TreeNode617(1);
        TreeNode617 t2 = new TreeNode617(2);

        Solution617 solution = new Solution617();
        TreeNode617 stdout = solution.mergeTrees(t1, t2);

        System.out.println(stdout);
    }
}
