package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int size = 0;
        for (int i = 1; i <= n; i++) {
            if (i == target[size]) {
                ans.add("Push");
                size++;
            } else {
                ans.add("Push");
                ans.add("Pop");
            }
            if (size == target.length) {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] target = {1, 3};
        int n = 3;

        Solution1441 solution = new Solution1441();
        List<String> stdout = solution.buildArray(target, n);

        System.out.println(stdout);
    }
}
