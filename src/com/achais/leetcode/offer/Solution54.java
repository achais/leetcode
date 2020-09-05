package com.achais.leetcode.offer;

import java.util.LinkedList;
import java.util.List;

class TreeNode54 {
    int val;
    TreeNode54 left;
    TreeNode54 right;

    TreeNode54(int x) {
        val = x;
    }
}

public class Solution54 {
    /**
     * 二叉搜索树, 复原有序列表, 再找第k大
     */
    public int kthLargest(TreeNode54 root, int k) {
        List<Integer> list = new LinkedList<>();
        DFS(root, list);
        return list.get(list.size() - k);
    }

    public void DFS(TreeNode54 root, List<Integer> list) {
        if (root != null) {
            DFS(root.left, list);
            list.add(root.val);
            DFS(root.right, list);
        }
    }

    public static void main(String[] args) {
        TreeNode54 root = new TreeNode54(1);
        int k = 1;

        Solution54 solution = new Solution54();
        Integer stdout = solution.kthLargest(root, k);

        System.out.println(stdout);
    }
}
