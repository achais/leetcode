package com.achais.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode637 {
    int val;
    TreeNode637 left;
    TreeNode637 right;

    TreeNode637(int x) {
        val = x;
    }
}

public class Solution637 {
    public List<Double> averageOfLevels(TreeNode637 root) {
        List<Double> ans = new ArrayList<>();
        BFS(root, ans);
        return ans;
    }

    public void BFS(TreeNode637 root, List<Double> ans) {
        if (root == null) {
            return;
        }

        Queue<TreeNode637> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size(), oldSize = queue.size();
            double sum = 0;
            while (size-- > 0) {
                TreeNode637 node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ans.add(sum / oldSize);
        }
    }

    public static void main(String[] args) {
        TreeNode637 root = new TreeNode637(1);

        Solution637 solution = new Solution637();
        List<Double> stdout = solution.averageOfLevels(root);

        System.out.println(stdout);
    }
}
