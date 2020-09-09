package com.achais.leetcode.offer;

import java.util.LinkedList;
import java.util.List;

class TreeNode34 {
    int val;
    TreeNode34 left;
    TreeNode34 right;

    TreeNode34(int x) {
        val = x;
    }
}

public class Solution34 {
    List<List<Integer>> res = new LinkedList<>();
    List<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode34 root, int sum) {
        recur(root, sum);
        return res;
    }

    public void recur(TreeNode34 root, int tar) {
        if (root != null) {
            path.add(root.val);
            tar -= root.val;
            if (tar == 0 && root.left == null && root.right == null) {
                res.add(new LinkedList<>(path));
            }

            recur(root.left, tar);
            recur(root.right, tar);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        TreeNode34 root = new TreeNode34(1);
        int sum = 1;

        Solution34 solution = new Solution34();
        List<List<Integer>> stdout = solution.pathSum(root, sum);

        System.out.println(stdout);
    }
}
