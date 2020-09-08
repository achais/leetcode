package com.achais.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

class TreeNode07 {
    int val;
    TreeNode07 left;
    TreeNode07 right;

    TreeNode07(int x) {
        val = x;
    }
}

public class Solution07 {
    Map<Integer, Integer> map = new HashMap<>();
    int[] po;

    public TreeNode07 buildTree(int[] preorder, int[] inorder) {
        po = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }

    TreeNode07 recur(int pre_root, int in_left, int in_right) {
        if (in_left > in_right) return null;
        TreeNode07 root = new TreeNode07(po[pre_root]);
        int i = map.get(po[pre_root]);
        root.left = recur(pre_root + 1, in_left, i - 1);
        // 前序中, 右子树根节点索引 = 根节点索引 + 左子树长度 + 1
        root.right = recur(pre_root + (i - in_left) + 1, i + 1, in_right);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Solution07 solution = new Solution07();
        TreeNode07 stdout = solution.buildTree(preorder, inorder);

        System.out.println(stdout);
    }
}
