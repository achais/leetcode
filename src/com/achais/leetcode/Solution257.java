package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode257 {
    int val;
    TreeNode257 left;
    TreeNode257 right;

    TreeNode257(int x) {
        val = x;
    }
}

public class Solution257 {
    List<String> ans = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode257 root) {
        StringBuilder path = new StringBuilder();
        DFS(root, path);
        return ans;
    }

    public void DFS(TreeNode257 root, StringBuilder path) {
        if (root == null) {
            return;
        }
        path.append(root.val);

        if (root.left == null && root.right == null) {
            ans.add(path.toString());
        }

        if (root.left != null) {
            DFS(root.left, new StringBuilder(path).append("->"));
        }
        if (root.right != null) {
            DFS(root.right, new StringBuilder(path).append("->"));
        }
    }

    public static void main(String[] args) {
        TreeNode257 root = new TreeNode257(1);

        Solution257 solution = new Solution257();
        List<String> stdout = solution.binaryTreePaths(root);

        System.out.println(stdout);
    }
}
