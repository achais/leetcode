package com.achais.leetcode.offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode32 {
    int val;
    TreeNode32 left;
    TreeNode32 right;

    TreeNode32(int x) {
        val = x;
    }
}

public class Solution32 {
    public List<List<Integer>> levelOrder(TreeNode32 root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode32> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> t = new LinkedList<>();
            while (size-- > 0) {
                TreeNode32 node = queue.poll();
                if (node != null) {
                    t.add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
            if (!t.isEmpty()) {
                ans.add(t);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        TreeNode32 root = new TreeNode32(2);

        Solution32 solution = new Solution32();
        List<List<Integer>> stdout = solution.levelOrder(root);

        System.out.println(stdout);
    }
}
