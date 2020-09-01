package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode872 {
    int val;
    TreeNode872 left;
    TreeNode872 right;

    TreeNode872(int x) {
        val = x;
    }
}

public class Solution872 {
    public boolean leafSimilar(TreeNode872 root1, TreeNode872 root2) {
        List<Integer> list1 = new ArrayList<>();
        DFS(root1, list1);
        List<Integer> list2 = new ArrayList<>();
        DFS(root2, list2);

        return list1.equals(list2);
    }

    public void DFS(TreeNode872 root, List<Integer> list) {
        if (root != null) {
            if (root.left != null) {
                DFS(root.left, list);
            }
            if (root.left == null && root.right == null) {
                list.add(root.val);
            }
            if (root.right != null) {
                DFS(root.right, list);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode872 root1 = new TreeNode872(1);
        TreeNode872 root2 = new TreeNode872(1);

        Solution872 solution = new Solution872();
        boolean stdout = solution.leafSimilar(root1, root2);

        System.out.println(stdout);
    }
}
