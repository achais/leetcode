package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode94 {
    int val;
    TreeNode94 left;
    TreeNode94 right;

    TreeNode94(int x) {
        val = x;
    }
}

public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode94 root) {
        List<Integer> res = new ArrayList<>();
        recur(root, res);
        return res;
    }

    public void recur(TreeNode94 node, List<Integer> list){
        if (node != null) {
            recur(node.left, list);
            list.add(node.val);
            recur(node.right, list);
        }
    }

    public static void main(String[] args) {
        TreeNode94 root = new TreeNode94(1);

        Solution94 solution = new Solution94();
        List<Integer> stdout = solution.inorderTraversal(root);

        System.out.println(stdout);
    }
}
