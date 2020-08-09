package com.achais.leetcode;

class TreeNode108 {
    int val;
    TreeNode108 left;
    TreeNode108 right;

    TreeNode108(int x) {
        val = x;
    }
}

public class Solution108 {
    public TreeNode108 sortedArrayToBST(int[] nums) {
        int left = 0, right = nums.length - 1;
        return helper(nums, left, right);
    }

    public TreeNode108 helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mod = (left + right) / 2;

        TreeNode108 node = new TreeNode108(nums[mod]);
        node.left = helper(nums, left, mod - 1);
        node.right = helper(nums, mod + 1, right);
        return node;
    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};

        Solution108 solution = new Solution108();
        TreeNode108 stdout = solution.sortedArrayToBST(nums);

        System.out.println(stdout);
    }
}
