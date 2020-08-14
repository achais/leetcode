package com.achais.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode107 {
    int val;
    TreeNode107 left;
    TreeNode107 right;

    TreeNode107(int x) {
        val = x;
    }
}

public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode107 root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode107> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            int size = queue.size();
            while (size-- > 0) {
                TreeNode107 node = queue.poll();
                if (node == null) continue;
                tempList.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ans.add(0, tempList);
        }

        return ans;
    }

    public static void main(String[] args) {
        TreeNode107 root = new TreeNode107(2);

        Solution107 solution = new Solution107();
        List<List<Integer>> stdout = solution.levelOrderBottom(root);

        System.out.println(stdout);
    }
}
